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
}
