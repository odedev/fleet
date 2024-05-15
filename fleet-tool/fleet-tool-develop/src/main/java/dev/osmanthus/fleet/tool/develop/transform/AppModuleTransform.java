package dev.osmanthus.fleet.tool.develop.transform;

import dev.osmanthus.fleet.common.transform.Transform;
import dev.osmanthus.fleet.tool.develop.entity.AppModule;
import dev.osmanthus.fleet.tool.develop.model.AppModuleModel;

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
