package dev.osmanthus.fleet.app.main.rocksdb;

import dev.osmanthus.fleet.component.rocksdb.RocksdbRepository;
import org.springframework.stereotype.Service;

import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;
import java.nio.charset.Charset;
import java.nio.charset.StandardCharsets;

@Service("dev.osmanthus.fleet.app.main.rocksdb.RocksdbService")
public class RocksdbService {
    private final RocksdbRepository rocksdbRepository;

    public RocksdbService(RocksdbRepository rocksdbRepository) {
        this.rocksdbRepository = rocksdbRepository;
    }

    public Object get(String key) {
        Charset charset = StandardCharsets.UTF_8;
        return rocksdbRepository.get(key.getBytes(charset));
    }

    public Object put(String key, String value) {
        Charset charset = StandardCharsets.UTF_8;
//        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
//        ObjectOutputStream objectOutputStream = null;
//        try {
//            objectOutputStream = new ObjectOutputStream(byteArrayOutputStream);
//            objectOutputStream.writeObject(value);
//        } catch (IOException e) {
//            throw new RuntimeException(e);
//        }
//        byte[] byteArray = byteArrayOutputStream.toByteArray();
        rocksdbRepository.put(key.getBytes(charset), value.getBytes(charset));
        byte[] bytes = rocksdbRepository.get(key.getBytes(charset));
        return new String(bytes, charset);
    }
}
