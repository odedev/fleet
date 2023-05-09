package dev.odes.fleet.develop.transform;

import dev.odes.fleet.common.transform.Transform;
import dev.odes.fleet.develop.entity.Model;
import dev.odes.fleet.develop.model.ModelModel;
import org.springframework.stereotype.Component;

@Component
public class ModelTransform implements Transform<Model, ModelModel> {
    @Override
    public ModelModel toModel(Model model) {
        ModelModel modelModel = new ModelModel(model);

        return modelModel;
    }

    @Override
    public Model toEntity(ModelModel modelModel) {
        return modelModel.toEntity();
    }
}
