package dev.osmanthus.fleet.component.rocksdb;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Configuration;

@Configuration
public class RocksdbConfig {
    @Value("${rocksdb.directory:data}")
    private String directory;
    @Value("${rocksdb.name:rocksdb}")
    private String name;

    public RocksdbConfig() {
    }

    public String getDirectory() {
        return directory;
    }

    public void setDirectory(String directory) {
        this.directory = directory;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
