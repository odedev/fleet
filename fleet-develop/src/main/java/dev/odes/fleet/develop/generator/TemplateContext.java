package dev.odes.fleet.develop.generator;

import dev.odes.fleet.develop.model.ModuleModel;

public class TemplateContext {
    private ModuleModel model;

    public TemplateContext() {
    }

    public TemplateContext(ModuleModel model) {
        this.model = model;
    }

    public ModuleModel getModel() {
        return model;
    }

    public void setModel(ModuleModel model) {
        this.model = model;
    }
}
