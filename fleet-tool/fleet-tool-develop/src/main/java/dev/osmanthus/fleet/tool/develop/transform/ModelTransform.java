package dev.osmanthus.fleet.tool.develop.transform;

import dev.osmanthus.fleet.common.transform.Transform;
import dev.osmanthus.fleet.tool.develop.entity.Model;
import dev.osmanthus.fleet.tool.develop.entity.Module;
import dev.osmanthus.fleet.tool.develop.model.ModelFieldModel;
import dev.osmanthus.fleet.tool.develop.model.ModelModel;
import dev.osmanthus.fleet.tool.develop.model.ModuleModel;
import dev.osmanthus.fleet.tool.develop.repository.ModuleRepository;
import dev.osmanthus.fleet.tool.develop.service.ModelFieldService;
import org.springframework.stereotype.Component;

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
        modelModel.setFields(modelFields);

        return modelModel;
    }

    @Override
    public Model toEntity(ModelModel modelModel) {
        return modelModel.toEntity();
    }
}
