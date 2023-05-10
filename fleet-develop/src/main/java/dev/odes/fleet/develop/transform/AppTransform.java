package dev.odes.fleet.develop.transform;

import dev.odes.fleet.common.transform.Transform;
import dev.odes.fleet.develop.entity.App;
import dev.odes.fleet.develop.model.AppModel;

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
