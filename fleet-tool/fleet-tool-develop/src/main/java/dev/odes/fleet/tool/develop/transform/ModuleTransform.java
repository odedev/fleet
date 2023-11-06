package dev.odes.fleet.tool.develop.transform;

import dev.odes.fleet.common.transform.Transform;
import dev.odes.fleet.tool.develop.entity.Module;
import dev.odes.fleet.tool.develop.model.ModuleModel;
import org.springframework.stereotype.Component;

@Component
public class ModuleTransform implements Transform<Module, ModuleModel> {
    @Override
    public ModuleModel toModel(Module entity) {
        return new ModuleModel(entity);
    }

    @Override
    public Module toEntity(ModuleModel model) {
        return model.toEntity();
    }
}
