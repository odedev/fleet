package dev.odes.fleet.core.file.repository;

import dev.odes.fleet.core.file.entity.ResourceFile;
import dev.odes.fleet.core.file.mapper.ResourceFileMapper;
import dev.odes.fleet.database.mysql.MysqlRepository;
import org.springframework.stereotype.Repository;

@Repository
public class ResourceFileRepository extends MysqlRepository<ResourceFile, ResourceFileMapper> {
    private final ResourceFileMapper resourceFileMapper;
    public ResourceFileRepository(ResourceFileMapper resourceFileMapper) {
        super(resourceFileMapper);
        this.resourceFileMapper = resourceFileMapper;
    }
}
