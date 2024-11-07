package dev.osmanthus.fleet.component.rocksdb;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.Objects;
import java.util.concurrent.locks.ReadWriteLock;
import java.util.concurrent.locks.ReentrantReadWriteLock;
import org.rocksdb.*;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Repository;

@Repository("dev.osmanthus.fleet.component.rocksdb.RocksdbRepository")
public class RocksdbRepository {

    static {
        RocksDB.loadLibrary();
    }

    private ReadOptions readOptions;
    private RocksDB database;
    private final RocksdbConfig rocksdbConfig;
    private static final ReadWriteLock readWriteLock = new ReentrantReadWriteLock();
    private static final org.slf4j.Logger logger = LoggerFactory.getLogger(RocksdbRepository.class);

    public RocksdbRepository(RocksdbConfig rocksdbConfig) {
        this.rocksdbConfig = rocksdbConfig;
        this.init();
    }

    public byte[] get(byte[] key) {
        readWriteLock.writeLock().lock();
        try {
            return this.database.get(key);
        } catch (RocksDBException e) {
            throw new RuntimeException(this.rocksdbConfig.getName(), e);
        } finally {
            readWriteLock.writeLock().unlock();
        }
    }

    public void put(byte[] key, byte[] value) {
        readWriteLock.writeLock().lock();
        try {
            this.database.put(key, value);
        } catch (RocksDBException e) {
            throw new RuntimeException(this.rocksdbConfig.getName(), e);
        } finally {
            readWriteLock.writeLock().unlock();
        }
    }

    public void delete(byte[] key) {
        readWriteLock.writeLock().lock();
        try {
            this.database.delete(key);
        } catch (RocksDBException e) {
            throw new RuntimeException(this.rocksdbConfig.getName(), e);
        } finally {
            readWriteLock.writeLock().unlock();
        }
    }

    public void close() {
        readWriteLock.writeLock().lock();
        try {
            this.database.close();
        } catch (Exception e) {
            throw new RuntimeException(this.rocksdbConfig.getName(), e);
        } finally {
            readWriteLock.writeLock().unlock();
        }
    }

    public void backup(String path) {
        try (Checkpoint checkpoint = Checkpoint.create(database)) {
            checkpoint.createCheckpoint(path);
        } catch (RocksDBException e) {
            throw new RuntimeException(this.rocksdbConfig.getName(), e);
        }
    }

    private Path getPath() {
        return Paths.get(this.rocksdbConfig.getDirectory(), this.rocksdbConfig.getName());
    }

    private void init() {
        if (this.rocksdbConfig.getName() == null || this.rocksdbConfig.getName().isEmpty()) {
            throw new IllegalArgumentException("No name set to the RocksdbStore");
        }

        if (!Files.isSymbolicLink(this.getPath().getParent())) {
            try {
                Files.createDirectories(this.getPath().getParent());
            } catch (IOException e) {
                throw new RuntimeException(e);
            }
        }

        readWriteLock.writeLock().lock();

        try {
            try (Options options = new Options()) {
                this.readOptions = new ReadOptions();
                this.readOptions.setPrefixSameAsStart(true)
                    .setVerifyChecksums(false);

                final LRUCache cache = new LRUCache(1 * 1024 * 1024 * 1024L);
                final BlockBasedTableConfig tableConfig = new BlockBasedTableConfig();
                tableConfig.setBlockSize(64 * 1024L);
                tableConfig.setBlockCache(cache);
                tableConfig.setCacheIndexAndFilterBlocks(true);
                tableConfig.setPinL0FilterAndIndexBlocksInCache(true);
//                tableConfig.setFilter(new BloomFilter(10, false));

                options.setTableFormatConfig(tableConfig);

                options.setCreateIfMissing(true);
                options.setIncreaseParallelism(1);
                options.setLevelCompactionDynamicLevelBytes(true);
                options.setMaxOpenFiles(5 * 1024);
                options.setNumLevels(7);
                options.setMaxBytesForLevelMultiplier(10);
                options.setMaxBytesForLevelBase(256 * 1024 * 1024);
                options.setTargetFileSizeMultiplier(1);
                options.setTargetFileSizeBase(256 * 1024 * 1024);
                options.setLevel0FileNumCompactionTrigger(1);
//                options.setMaxBackgroundCompactions(32);
                options.setWriteBufferSize(16 * 1024 * 1024);
                options.setLogger(new Logger(options) {
                    @Override
                    protected void log(InfoLogLevel infoLogLevel, String logMsg) {
                        logger.info(infoLogLevel.toString(), logMsg);
                    }
                });

                try {
                    this.database = RocksDB.open(options, this.getPath().toString());
                } catch (RocksDBException e) {
                    if (Objects.equals(e.getStatus().getCode(), Status.Code.Corruption)) {
                        logger.error("Database {} corrupted, please delete database directory({}) " +
                            "and restart.", this.rocksdbConfig.getName(), this.rocksdbConfig.getDirectory(), e);
                    } else {
                        logger.error("Open Database {} failed", this.rocksdbConfig.getName(), e);
                    }
                    throw new RuntimeException(this.rocksdbConfig.getName(), e);
                }
            }
        } finally {
            readWriteLock.writeLock().unlock();
        }
    }
}
