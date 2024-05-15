package dev.osmanthus.fleet.tool.develop.model;

import dev.osmanthus.fleet.common.model.AbstractModel;
import dev.osmanthus.fleet.tool.develop.entity.Module;
import dev.osmanthus.fleet.tool.develop.enumeration.StorageTypeEnum;

public class ModuleModel extends AbstractModel<Module> {
    private String id;
    private String code;
    private String name;
    private String description;
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
        this.setStorageType(StorageTypeEnum.getByValue(module.getStorageType()));
    }

    @Override
    public Module toEntity() {
        Module module = new Module();
        module.setId(this.getId());
        module.setCode(this.getCode());
        module.setName(this.getName());
        module.setDescription(this.getDescription());
        module.setStorageType(this.getStorageType().getValue());
        return module;
    }
}
