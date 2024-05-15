package dev.osmanthus.fleet.core.asset.service;

import dev.osmanthus.fleet.common.service.AbstractService;
import dev.osmanthus.fleet.core.asset.entity.ResourceFile;
import dev.osmanthus.fleet.core.asset.model.ResourceFileModel;
import dev.osmanthus.fleet.core.asset.repository.ResourceFileRepository;
import dev.osmanthus.fleet.core.asset.transform.ResourceFileTransform;
import org.springframework.stereotype.Service;

@Service("dev.osmanthus.fleet.core.asset.service.ResourceFileService")
public class ResourceFileService extends AbstractService<ResourceFile, ResourceFileModel, ResourceFileRepository> {
    private final ResourceFileTransform resourceFileTransform;
    private final ResourceFileRepository resourceFileRepository;
    public ResourceFileService(ResourceFileTransform resourceFileTransform, ResourceFileRepository resourceFileRepository) {
        super(resourceFileRepository);
        this.resourceFileTransform = resourceFileTransform;
        this.resourceFileRepository = resourceFileRepository;
    }

    @Override
    public ResourceFileModel transform(ResourceFile resourceFile) {
        return this.resourceFileTransform.toModel(resourceFile);
    }

    @Override
    public ResourceFile transform(ResourceFileModel resourceFileModel) {
        return this.resourceFileTransform.toEntity(resourceFileModel);
    }

    @Override
    public void setDefaultValue(ResourceFileModel resourceFileModel) {
    }

    @Override
    public void validate(ResourceFileModel resourceFileModel) {
    }

    @Override
    public void beforeInsert(ResourceFileModel resourceFileModel) {
    }

    @Override
    public void beforeUpdate(ResourceFileModel resourceFileModel) {
    }

    @Override
    public void beforeDelete(ResourceFileModel resourceFileModel) {
    }

    @Override
    public void inserted(ResourceFileModel resourceFileModel) {
    }

    @Override
    public void updated(ResourceFileModel resourceFileModel) {
    }

    @Override
    public void deleted(ResourceFileModel resourceFileModel) {
    }
}
