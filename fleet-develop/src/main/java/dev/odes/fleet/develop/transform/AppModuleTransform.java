package dev.odes.fleet.develop.transform;

import dev.odes.fleet.common.transform.Transform;
import dev.odes.fleet.develop.entity.AppModule;
import dev.odes.fleet.develop.model.AppModuleModel;

public class AppModuleTransform implements Transform<AppModule, AppModuleModel> {
    @Override
    public AppModuleModel toModel(AppModule entity) {
        AppModuleModel model = new AppModuleModel(entity);
        return model;
    }

    @Override
    public AppModule toEntity(AppModuleModel appModuleModel) {
        return appModuleModel.toEntity();
    }
}
