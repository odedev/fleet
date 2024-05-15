package dev.osmanthus.fleet.tool.develop.service;

import dev.osmanthus.fleet.common.service.AbstractService;
import dev.osmanthus.fleet.tool.develop.entity.ViewBlock;
import dev.osmanthus.fleet.tool.develop.model.ViewBlockModel;
import dev.osmanthus.fleet.tool.develop.repository.ViewBlockRepository;
import dev.osmanthus.fleet.tool.develop.transform.ViewBlockTransform;
import org.springframework.stereotype.Service;

@Service
public class ViewBlockService extends AbstractService<ViewBlock, ViewBlockModel, ViewBlockRepository> {
    private final ViewBlockTransform viewBlockTransform;
    private final ViewBlockRepository viewBlockRepository;
    public ViewBlockService(ViewBlockTransform viewBlockTransform, ViewBlockRepository viewBlockRepository) {
        super(viewBlockRepository);
        this.viewBlockTransform = viewBlockTransform;
        this.viewBlockRepository = viewBlockRepository;
    }

    @Override
    public ViewBlockModel transform(ViewBlock viewBlock) {
        return this.viewBlockTransform.toModel(viewBlock);
    }

    @Override
    public ViewBlock transform(ViewBlockModel viewBlockModel) {
        return this.viewBlockTransform.toEntity(viewBlockModel);
    }

    @Override
    public void setDefaultValue(ViewBlockModel viewBlockModel) {
        super.setDefaultValue(viewBlockModel);
    }

    @Override
    public void validate(ViewBlockModel viewBlockModel) {
        super.validate(viewBlockModel);
    }

    @Override
    public void beforeInsert(ViewBlockModel viewBlockModel) {
        super.beforeInsert(viewBlockModel);
    }

    @Override
    public void beforeUpdate(ViewBlockModel viewBlockModel) {
        super.beforeUpdate(viewBlockModel);
    }

    @Override
    public void beforeDelete(ViewBlockModel viewBlockModel) {
        super.beforeDelete(viewBlockModel);
    }

    @Override
    public void inserted(ViewBlockModel viewBlockModel) {
        super.inserted(viewBlockModel);
    }

    @Override
    public void updated(ViewBlockModel viewBlockModel) {
        super.updated(viewBlockModel);
    }

    @Override
    public void deleted(ViewBlockModel viewBlockModel) {
        super.deleted(viewBlockModel);
    }
}
