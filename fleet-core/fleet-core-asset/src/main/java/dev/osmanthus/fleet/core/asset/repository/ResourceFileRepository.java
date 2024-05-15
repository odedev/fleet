package dev.osmanthus.fleet.core.asset.repository;

import dev.osmanthus.fleet.core.asset.entity.ResourceFile;
import dev.osmanthus.fleet.core.asset.mapper.ResourceFileMapper;
import dev.osmanthus.fleet.component.mysql.MysqlRepository;
import org.springframework.stereotype.Repository;

@Repository("dev.osmanthus.fleet.core.asset.repository.ResourceFileRepository")
public class ResourceFileRepository extends MysqlRepository<ResourceFile, ResourceFileMapper> {
    private final ResourceFileMapper resourceFileMapper;
    public ResourceFileRepository(ResourceFileMapper resourceFileMapper) {
        super(resourceFileMapper);
        this.resourceFileMapper = resourceFileMapper;
    }
}
