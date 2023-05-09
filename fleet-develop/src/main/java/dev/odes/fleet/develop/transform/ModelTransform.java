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
import org.springframework.stereotype.Component;

import java.util.ArrayList;
import java.util.List;

@Component
public class ModelTransform implements Transform<Model, ModelModel> {
    private final ModuleRepository moduleRepository;
    private final ModelFieldRepository modelFieldRepository;
    public ModelTransform(ModuleRepository moduleRepository, ModelFieldRepository modelFieldRepository) {
        this.moduleRepository = moduleRepository;
        this.modelFieldRepository = modelFieldRepository;
    }

    @Override
    public ModelModel toModel(Model model) {
        ModelModel modelModel = new ModelModel(model);
        Module module = this.moduleRepository.findOneById(model.getModule());
        List<ModelField> modelFieldList = this.modelFieldRepository.findManyById("model", model.getId());

        if (module != null) {
            modelModel.setModule(new ModuleModel(module));
        }

        List<ModelFieldModel> modelFields = new ArrayList<>();
        modelFieldList.forEach(modelField -> {
            modelFields.add(new ModelFieldModel(modelField));
        });
        modelModel.setModelFields(modelFields);
        return modelModel;
    }

    @Override
    public Model toEntity(ModelModel modelModel) {
        return modelModel.toEntity();
    }
}
