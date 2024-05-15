package dev.osmanthus.fleet.tool.develop.transform;

import dev.osmanthus.fleet.common.transform.Transform;
import dev.osmanthus.fleet.tool.develop.entity.App;
import dev.osmanthus.fleet.tool.develop.model.AppModel;

public class AppTransform implements Transform<App, AppModel> {
    @Override
    public AppModel toModel(App entity) {
        return new AppModel(entity);
    }

    @Override
    public App toEntity(AppModel model) {
        return model.toEntity();
    }
}
