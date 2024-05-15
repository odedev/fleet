package dev.osmanthus.fleet.tool.develop.model;

import dev.osmanthus.fleet.common.model.AbstractModel;
import dev.osmanthus.fleet.tool.develop.entity.App;

public class AppModel extends AbstractModel<App> {
    private String id;
    private String code;
    private String name;
    private String port;
    private String description;

    public AppModel() {
    }

    public AppModel(App app) {
        this.fromEntity(app);
    }

    @Override
    public String getId() {
        return id;
    }

    @Override
    public void setId(String id) {
        this.id = id;
    }

    public String getCode() {
        return code;
    }

    public void setCode(String code) {
        this.code = code;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getPort() {
        return port;
    }

    public void setPort(String port) {
        this.port = port;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    @Override
    public void fromEntity(App app) {
        if (app == null) {
            return;
        }
        this.setId(app.getId());
        this.setCode(app.getCode());
        this.setName(app.getName());
        this.setPort(app.getPort());
        this.setDescription(app.getDescription());
    }

    @Override
    public App toEntity() {
        App app = new App();
        app.setId(this.getId());
        app.setCode(this.getCode());
        app.setName(this.getName());
        app.setPort(this.getPort());
        app.setDescription(this.getDescription());
        return app;
    }
}
