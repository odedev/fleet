package dev.odes.fleet.develop.service;

import dev.odes.fleet.common.service.AbstractService;
import dev.odes.fleet.develop.entity.ModelField;
import dev.odes.fleet.develop.model.ModelFieldModel;
import dev.odes.fleet.develop.repository.ModelFieldRepository;
import dev.odes.fleet.develop.transform.ModelFieldTransform;
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
