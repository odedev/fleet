package dev.odes.fleet.develop.service;

import dev.odes.fleet.common.service.AbstractService;
import dev.odes.fleet.develop.entity.Model;
import dev.odes.fleet.develop.model.ModelModel;
import dev.odes.fleet.develop.model.ModuleModel;
import dev.odes.fleet.develop.repository.ModelRepository;
import dev.odes.fleet.develop.transform.ModelTransform;
import org.springframework.stereotype.Service;

@Service
public class ModelService extends AbstractService<Model, ModelModel, ModelRepository> {
    private final ModelTransform modelTransform;
    private final ModelRepository modelRepository;

    public ModelService(ModelTransform modelTransform, ModelRepository modelRepository) {
        super(modelRepository);
        this.modelTransform = modelTransform;
        this.modelRepository = modelRepository;
    }

    @Override
    public ModelModel transform(Model model) {
        return this.modelTransform.toModel(model);
    }

    @Override
    public Model transform(ModelModel modelModel) {
        return this.modelTransform.toEntity(modelModel);
    }

    @Override
    public void setDefaultValue(ModelModel modelModel) {
        super.setDefaultValue(modelModel);
        String modelCode = modelModel.getCode();
        String moduleCode = "";
        ModuleModel module = modelModel.getModule();
        if (module != null) {
            moduleCode = module.getCode();
        }
        modelModel.setFullName("dev.odes.fleet.module." + moduleCode + ".model." + modelCode + "Model");
    }

    @Override
    public void validate(ModelModel modelModel) {
        super.validate(modelModel);
    }

    @Override
    public void beforeInsert(ModelModel modelModel) {
        super.beforeInsert(modelModel);
    }

    @Override
    public void beforeUpdate(ModelModel modelModel) {
        super.beforeUpdate(modelModel);
    }

    @Override
    public void beforeDelete(ModelModel modelModel) {
        super.beforeDelete(modelModel);
    }
}
