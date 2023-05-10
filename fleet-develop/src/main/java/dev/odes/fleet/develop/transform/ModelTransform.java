package dev.odes.fleet.develop.transform;

import dev.odes.fleet.common.transform.Transform;
import dev.odes.fleet.develop.entity.Model;
import dev.odes.fleet.develop.entity.ModelField;
import dev.odes.fleet.develop.entity.Module;
import dev.odes.fleet.develop.model.ModelFieldModel;
import dev.odes.fleet.develop.model.ModelModel;
import dev.odes.fleet.develop.model.ModuleModel;
import dev.odes.fleet.develop.repository.ModelFieldRepository;
import dev.odes.fleet.develop.repository.ModuleRepository;
import dev.odes.fleet.develop.service.ModelFieldService;
import org.springframework.stereotype.Component;

import java.util.ArrayList;
import java.util.List;

@Component
public class ModelTransform implements Transform<Model, ModelModel> {
    private final ModuleRepository moduleRepository;
    private final ModelFieldService modelFieldService;
    public ModelTransform(ModuleRepository moduleRepository, ModelFieldService modelFieldService) {
        this.moduleRepository = moduleRepository;
        this.modelFieldService = modelFieldService;
    }

    @Override
    public ModelModel toModel(Model model) {
        ModelModel modelModel = new ModelModel(model);

        Module module = this.moduleRepository.findOneById(model.getModule());
        if (module != null) {
            modelModel.setModule(new ModuleModel(module));
        }

        // 主从关系需要调用service
        List<ModelFieldModel> modelFields = this.modelFieldService.findManyById("model", model.getId());
//        List<ModelField> modelFieldList = this.modelFieldRepository.findManyById("model", model.getId());
//        List<ModelFieldModel> modelFields = new ArrayList<>();
//        modelFieldList.forEach(modelField -> {
//            modelFields.add(new ModelFieldModel(modelField));
//        });
        modelModel.setModelFields(modelFields);

        return modelModel;
    }

    @Override
    public Model toEntity(ModelModel modelModel) {
        return modelModel.toEntity();
    }
}
