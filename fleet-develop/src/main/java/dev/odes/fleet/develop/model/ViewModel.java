package dev.odes.fleet.develop.model;

import dev.odes.fleet.common.model.AbstractModel;
import dev.odes.fleet.develop.entity.View;

import java.util.List;

public class ViewModel extends AbstractModel<View> {
    private String id;
    private String code;
    private String name;
    private String path;
    private Integer sn;
    private Boolean isMasterView;
    private ViewModel parent;
    private ModuleModel module;

    private List<ModuleModel> children;

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

    public ViewModel getParent() {
        return parent;
    }

    public void setParent(ViewModel parent) {
        this.parent = parent;
    }

    public ModuleModel getModule() {
        return module;
    }

    public void setModule(ModuleModel module) {
        this.module = module;
    }

    public List<ModuleModel> getChildren() {
        return children;
    }

    public void setChildren(List<ModuleModel> children) {
        this.children = children;
    }
}
