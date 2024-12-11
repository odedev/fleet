package dev.osmanthus.fleet.app.main.rocksdb;

import org.springframework.web.bind.annotation.*;

@RequestMapping("/rocksdb")
@RestController("dev.osmanthus.fleet.app.main.rocksdb.RocksdbController")
public class RocksdbController {
    private final RocksdbService rocksdbService;
    public RocksdbController(RocksdbService rocksdbService) {
        this.rocksdbService = rocksdbService;
    }

    @GetMapping("/get/{key}")
    public Object get(@PathVariable("key") String key) {
        return this.rocksdbService.get(key);
    }

    @GetMapping("/put/{key}")
    public Object put(@PathVariable("key") String key) {
        String value = "123abc";
        return this.rocksdbService.put(key, value);
    }

    @GetMapping("/put")
    public Object put() {
        String value = "123abc";
        return value;
//        return this.rocksdbService.put(key, value);
    }
}
