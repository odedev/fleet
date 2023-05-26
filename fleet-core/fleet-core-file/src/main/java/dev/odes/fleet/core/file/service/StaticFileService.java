package dev.odes.fleet.core.file.service;

import dev.odes.fleet.common.service.AbstractService;
import dev.odes.fleet.core.file.entity.StaticFile;
import dev.odes.fleet.core.file.model.StaticFileModel;
import dev.odes.fleet.core.file.repository.StaticFileRepository;
import dev.odes.fleet.core.file.transform.StaticFileTransform;
import org.springframework.stereotype.Service;

@Service
public class StaticFileService extends AbstractService<StaticFile, StaticFileModel, StaticFileRepository> {
    private final StaticFileTransform staticFileTransform;
    private final StaticFileRepository staticFileRepository;
    public StaticFileService(StaticFileTransform staticFileTransform, StaticFileRepository staticFileRepository) {
        super(staticFileRepository);
        this.staticFileTransform = staticFileTransform;
        this.staticFileRepository = staticFileRepository;
    }

    @Override
    public StaticFileModel transform(StaticFile staticFile) {
        return this.staticFileTransform.toModel(staticFile);
    }

    @Override
    public StaticFile transform(StaticFileModel staticFileModel) {
        return this.staticFileTransform.toEntity(staticFileModel);
    }

    @Override
    public void setDefaultValue(StaticFileModel staticFileModel) {
    }

    @Override
    public void validate(StaticFileModel staticFileModel) {
    }

    @Override
    public void beforeInsert(StaticFileModel staticFileModel) {
    }

    @Override
    public void beforeUpdate(StaticFileModel staticFileModel) {
    }

    @Override
    public void beforeDelete(StaticFileModel staticFileModel) {
    }

    @Override
    public void inserted(StaticFileModel staticFileModel) {
    }

    @Override
    public void updated(StaticFileModel staticFileModel) {
    }

    @Override
    public void deleted(StaticFileModel staticFileModel) {
    }
}
