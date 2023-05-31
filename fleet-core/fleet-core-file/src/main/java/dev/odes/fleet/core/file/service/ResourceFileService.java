package dev.odes.fleet.core.file.service;

import dev.odes.fleet.common.service.AbstractService;
import dev.odes.fleet.core.file.entity.ResourceFile;
import dev.odes.fleet.core.file.model.ResourceFileModel;
import dev.odes.fleet.core.file.repository.ResourceFileRepository;
import dev.odes.fleet.core.file.transform.ResourceFileTransform;
import org.springframework.stereotype.Service;

@Service
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
