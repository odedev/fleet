package dev.odes.fleet.develop.generator;

import dev.odes.fleet.develop.model.ModelModel;
import dev.odes.fleet.develop.model.ModuleModel;

public class TemplateContext {
    private String moduleType;
    private ModuleModel module;
    private ModelModel model;

    public TemplateContext() {
    }

    public TemplateContext(String moduleType, ModuleModel module, ModelModel model) {
        this.moduleType = moduleType;
        this.module = module;
        this.model = model;
    }

    public String getModuleType() {
        return moduleType;
    }

    public void setModuleType(String moduleType) {
        this.moduleType = moduleType;
    }

    public ModuleModel getModule() {
        return module;
    }

    public void setModule(ModuleModel module) {
        this.module = module;
    }

    public ModelModel getModel() {
        return model;
    }

    public void setModel(ModelModel model) {
        this.model = model;
    }
}
