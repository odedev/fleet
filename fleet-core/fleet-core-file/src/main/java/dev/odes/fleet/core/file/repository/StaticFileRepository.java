package dev.odes.fleet.core.file.repository;

import dev.odes.fleet.core.file.entity.StaticFile;
import dev.odes.fleet.core.file.mapper.StaticFileMapper;
import dev.odes.fleet.mysql.MysqlRepository;
import org.springframework.stereotype.Repository;

@Repository
public class StaticFileRepository extends MysqlRepository<StaticFile, StaticFileMapper> {
    private final StaticFileMapper staticFileMapper;
    public StaticFileRepository(StaticFileMapper staticFileMapper) {
        super(staticFileMapper);
        this.staticFileMapper = staticFileMapper;
    }
}
