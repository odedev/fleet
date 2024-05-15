package dev.osmanthus.fleet.tool.develop.model;

import dev.osmanthus.fleet.common.model.AbstractModel;
import dev.osmanthus.fleet.tool.develop.entity.AppModule;

public class AppModuleModel extends AbstractModel<AppModule> {
    private String id;
    private AppModel app;
    private ModuleModel module;

    public AppModuleModel() {
    }

    public AppModuleModel(AppModule entity) {
        this.fromEntity(entity);
    }

    @Override
    public String getId() {
        return id;
    }

    @Override
    public void setId(String id) {
        this.id = id;
    }

    public AppModel getApp() {
        return app;
    }

    public void setApp(AppModel app) {
        this.app = app;
    }

    public void setApp(String app) {
        if (app == null) {
            this.app = null;
        } else {
            AppModel appModel = new AppModel();
            appModel.setId(app);
            this.app = appModel;
        }
    }

    public ModuleModel getModule() {
        return module;
    }

    public void setModule(ModuleModel module) {
        this.module = module;
    }

    public void setModule(String module) {
        if (module == null) {
            this.module = null;
        } else {
            ModuleModel moduleModel = new ModuleModel();
            moduleModel.setId(module);
            this.module = moduleModel;
        }
    }

    @Override
    public void fromEntity(AppModule appModule) {
        this.setId(appModule.getId());
        this.setApp(appModule.getApp());
        this.setModule(appModule.getModule());
    }

    @Override
    public AppModule toEntity() {
        AppModule appModule = new AppModule();
        appModule.setId(this.getId());
        AppModel app = this.getApp();
        if (app != null) {
            appModule.setApp(app.getId());
        }
        ModuleModel module = this.getModule();
        if (module != null) {
            appModule.setModule(module.getId());
        }
        return appModule;
    }
}
