package dev.odes.fleet.develop.model;

import dev.odes.fleet.common.model.AbstractModel;
import dev.odes.fleet.develop.entity.Module;
import dev.odes.fleet.develop.enumeration.ModuleTypeEnum;
import dev.odes.fleet.develop.enumeration.StorageTypeEnum;

public class ModuleModel extends AbstractModel<Module> {
    private String id;
    private String code;
    private String name;
    private String description;
    private ModuleTypeEnum moduleType;
    private StorageTypeEnum storageType;

    public ModuleModel() {
    }

    public ModuleModel(Module module) {
        this.fromEntity(module);
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

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public ModuleTypeEnum getModuleType() {
        return moduleType;
    }

    public void setModuleType(ModuleTypeEnum moduleType) {
        this.moduleType = moduleType;
    }

    public StorageTypeEnum getStorageType() {
        return storageType;
    }

    public void setStorageType(StorageTypeEnum storageType) {
        this.storageType = storageType;
    }

    @Override
    public void fromEntity(Module module) {
        if (module == null) {
            return;
        }
        this.setId(module.getId());
        this.setCode(module.getCode());
        this.setName(module.getName());
        this.setDescription(module.getDescription());
        this.setModuleType(ModuleTypeEnum.getByValue(module.getModuleType()));
        this.setStorageType(StorageTypeEnum.getByValue(module.getStorageType()));
    }

    @Override
    public Module toEntity() {
        Module module = new Module();
        module.setId(this.getId());
        module.setCode(this.getCode());
        module.setName(this.getName());
        module.setDescription(this.getDescription());
        module.setModuleType(this.getModuleType().getValue());
        module.setStorageType(this.getStorageType().getValue());
        return module;
    }
}
