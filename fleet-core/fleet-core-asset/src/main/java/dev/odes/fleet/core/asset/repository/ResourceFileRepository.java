package dev.odes.fleet.core.asset.repository;

import dev.odes.fleet.core.asset.entity.ResourceFile;
import dev.odes.fleet.core.asset.mapper.ResourceFileMapper;
import dev.odes.fleet.component.mysql.MysqlRepository;
import org.springframework.stereotype.Repository;

@Repository
public class ResourceFileRepository extends MysqlRepository<ResourceFile, ResourceFileMapper> {
    private final ResourceFileMapper resourceFileMapper;
    public ResourceFileRepository(ResourceFileMapper resourceFileMapper) {
        super(resourceFileMapper);
        this.resourceFileMapper = resourceFileMapper;
    }
}
