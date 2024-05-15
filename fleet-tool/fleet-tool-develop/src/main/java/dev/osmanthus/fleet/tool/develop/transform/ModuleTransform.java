package dev.osmanthus.fleet.tool.develop.transform;

import dev.osmanthus.fleet.common.transform.Transform;
import dev.osmanthus.fleet.tool.develop.entity.Module;
import dev.osmanthus.fleet.tool.develop.model.ModuleModel;
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
