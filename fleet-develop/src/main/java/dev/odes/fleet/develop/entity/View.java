package dev.odes.fleet.develop.entity;

import dev.odes.fleet.common.entity.AbstractEntity;

public class View extends AbstractEntity {
    private String id;
    private String code;
    private String name;
    private String path;
    private Integer sn;
    private Boolean isMasterView;
    private String parent;
    private String module;

    public String getId() {
        return id;
    }

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

    public String getPath() {
        return path;
    }

    public void setPath(String path) {
        this.path = path;
    }

    public Integer getSn() {
        return sn;
    }

    public void setSn(Integer sn) {
        this.sn = sn;
    }

    public Boolean getIsMasterView() {
        return isMasterView;
    }

    public void setIsMasterView(Boolean masterView) {
        isMasterView = masterView;
    }

    public String getParent() {
        return parent;
    }

    public void setParent(String parent) {
        this.parent = parent;
    }

    public String getModule() {
        return module;
    }

    public void setModule(String module) {
        this.module = module;
    }
}
