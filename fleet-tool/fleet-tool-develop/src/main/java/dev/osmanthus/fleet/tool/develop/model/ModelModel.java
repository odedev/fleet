package dev.osmanthus.fleet.tool.develop.model;

import dev.osmanthus.fleet.common.model.AbstractModel;
import dev.osmanthus.fleet.tool.develop.entity.Model;

import java.util.List;

public class ModelModel extends AbstractModel<Model> {
    private String id;
    private String code;
    private String name;
    private String fullName;
    private String description;
    private ModuleModel module;
    private List<ModelFieldModel> fields;

    public ModelModel() {
    }

    public ModelModel(Model model) {
        this.fromEntity(model);
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

    public String getFullName() {
        return fullName;
    }

    public void setFullName(String fullName) {
        this.fullName = fullName;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
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

    public List<ModelFieldModel> getFields() {
        return fields;
    }

    public void setFields(List<ModelFieldModel> fields) {
        this.fields = fields;
    }

    @Override
    public void fromEntity(Model model) {
        if (model == null) {
            return;
        }
        this.setId(model.getId());
        this.setCode(model.getCode());
        this.setName(model.getName());
        this.setDescription(model.getDescription());
        this.setFullName(model.getFullName());
        this.setModule(model.getModule());
    }

    @Override
    public Model toEntity() {
        Model model = new Model();
        model.setId(this.getId());
        model.setCode(this.getCode());
        model.setName(this.getName());
        model.setDescription(this.getDescription());
        model.setFullName(this.getFullName());
        ModuleModel module = this.getModule();
        if (module != null) {
            model.setModule(module.getId());
        }
        return model;
    }
}
