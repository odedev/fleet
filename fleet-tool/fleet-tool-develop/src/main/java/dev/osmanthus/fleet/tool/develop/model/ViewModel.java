package dev.osmanthus.fleet.tool.develop.model;

import dev.osmanthus.fleet.common.model.AbstractModel;
import dev.osmanthus.fleet.tool.develop.entity.View;
import dev.osmanthus.fleet.tool.develop.enumeration.ViewTypeEnum;

import java.util.List;

public class ViewModel extends AbstractModel<View> {
    private String id;
    private String code;
    private String name;
    private String path;
    private String sequence;
    private Boolean isMasterView;
    private ViewTypeEnum viewType;
    private ViewModel parent;
    private ModuleModel module;

    private List<ModuleModel> children;

    public ViewModel() {
    }

    public ViewModel(View view) {
        this.fromEntity(view);
    }

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

    public String getSequence() {
        return sequence;
    }

    public void setSequence(String sequence) {
        this.sequence = sequence;
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

    public void setParent(String parent) {
        if (parent == null) {
            this.parent = null;
        } else {
            ViewModel viewModel = new ViewModel();
            viewModel.setId(parent);
            this.parent = viewModel;
        }
    }

    public ModuleModel getModule() {
        return module;
    }

    public void setModule(ModuleModel module) {
        this.module = module;
    }

    public void setModule(String moduleId) {
        if (moduleId == null) {
            this.module = null;
        } else {
            ModuleModel module = new ModuleModel();
            module.setId(moduleId);
            this.module = module;
        }
    }

    public List<ModuleModel> getChildren() {
        return children;
    }

    public void setChildren(List<ModuleModel> children) {
        this.children = children;
    }

    @Override
    public void fromEntity(View view) {
        if (view == null) {
            return;
        }
        this.setId(view.getId());
        this.setCode(view.getCode());
        this.setName(view.getName());
        this.setPath(view.getPath());
        this.setSequence(view.getSequence());
        this.setIsMasterView(view.getIsMasterView());
        this.setParent(view.getParent());
        this.setModule(view.getModule());
    }

    @Override
    public View toEntity() {
        View view = new View();
        view.setId(this.getId());
        view.setCode(this.getCode());
        view.setName(this.getName());
        view.setPath(this.getPath());
        view.setSequence(this.getSequence());
        view.setIsMasterView(this.getIsMasterView());

        ModuleModel module = this.getModule();
        ViewModel parent = this.getParent();
        if (module != null) {
            view.setModule(module.getId());
        }
        if (parent != null) {
            view.setParent(parent.getId());
        }
        return view;
    }
}
