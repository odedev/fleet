package dev.odes.fleet.develop.model;

import dev.odes.fleet.common.model.AbstractModel;
import dev.odes.fleet.develop.entity.AppModule;

public class AppModuleModel extends AbstractModel<AppModule> {
    private String id;

    @Override
    public String getId() {
        return id;
    }

    @Override
    public void setId(String id) {
        this.id = id;
    }

    @Override
    public void fromEntity(AppModule appModule) {

    }

    @Override
    public AppModule toEntity() {
        return null;
    }
}
