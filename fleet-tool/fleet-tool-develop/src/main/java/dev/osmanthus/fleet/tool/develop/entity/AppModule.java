package dev.osmanthus.fleet.tool.develop.entity;

import dev.osmanthus.fleet.common.entity.AbstractEntity;

public class AppModule extends AbstractEntity {
    private String id;
    private String app;
    private String module;

    @Override
    public String getId() {
        return id;
    }

    @Override
    public void setId(String id) {
        this.id = id;
    }

    public String getApp() {
        return app;
    }

    public void setApp(String app) {
        this.app = app;
    }

    public String getModule() {
        return module;
    }

    public void setModule(String module) {
        this.module = module;
    }
}
