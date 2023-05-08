package dev.odes.fleet.develop.model;

import dev.odes.fleet.common.model.AbstractModel;
import dev.odes.fleet.develop.entity.Model;

import java.util.List;

public class ModelModel extends AbstractModel<Model> {
    private String id;
    private String code;
    private String name;
    private String description;
    private String fullName;
    private ModuleModel module;
    private List<ModelFieldModel> modelFields;

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

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String getFullName() {
        return fullName;
    }

    public void setFullName(String fullName) {
        this.fullName = fullName;
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

    public List<ModelFieldModel> getModelFields() {
        return modelFields;
    }

    public void setModelFields(List<ModelFieldModel> modelFields) {
        this.modelFields = modelFields;
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
