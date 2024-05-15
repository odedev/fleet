package dev.osmanthus.fleet.tool.develop.service;

import dev.osmanthus.fleet.common.service.AbstractService;
import dev.osmanthus.fleet.tool.develop.entity.ModelField;
import dev.osmanthus.fleet.tool.develop.model.ModelFieldModel;
import dev.osmanthus.fleet.tool.develop.repository.ModelFieldRepository;
import dev.osmanthus.fleet.tool.develop.transform.ModelFieldTransform;
import org.springframework.stereotype.Service;

@Service
public class ModelFieldService extends AbstractService<ModelField, ModelFieldModel, ModelFieldRepository> {
    private final ModelFieldTransform modelFieldTransform;
    private final ModelFieldRepository modelFieldRepository;

    public ModelFieldService(ModelFieldTransform modelFieldTransform, ModelFieldRepository modelFieldRepository) {
        super(modelFieldRepository);
        this.modelFieldTransform = modelFieldTransform;
        this.modelFieldRepository = modelFieldRepository;
    }

    @Override
    public ModelFieldModel transform(ModelField modelField) {
        return this.modelFieldTransform.toModel(modelField);
    }

    @Override
    public ModelField transform(ModelFieldModel modelFieldModel) {
        return this.modelFieldTransform.toEntity(modelFieldModel);
    }

    @Override
    public void setDefaultValue(ModelFieldModel modelFieldModel) {
        super.setDefaultValue(modelFieldModel);
        if (modelFieldModel.getDataLength() != null) {
            modelFieldModel.setDataLength(255);
        }
    }

    @Override
    public void validate(ModelFieldModel modelFieldModel) {
        super.validate(modelFieldModel);
    }

    @Override
    public void beforeInsert(ModelFieldModel modelFieldModel) {
        super.beforeInsert(modelFieldModel);
    }

    @Override
    public void beforeUpdate(ModelFieldModel modelFieldModel) {
        super.beforeUpdate(modelFieldModel);
    }

    @Override
    public void beforeDelete(ModelFieldModel modelFieldModel) {
        super.beforeDelete(modelFieldModel);
    }
}
