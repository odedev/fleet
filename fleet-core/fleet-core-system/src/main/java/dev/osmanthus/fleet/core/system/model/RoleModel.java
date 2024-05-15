package dev.osmanthus.fleet.core.system.model;

import dev.osmanthus.fleet.common.model.AbstractModel;
import dev.osmanthus.fleet.core.system.entity.Role;

public class RoleModel extends AbstractModel<Role> {
    private String id;
    private String code;
    private String name;
    private String note;
    private Boolean isSystem;

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

    public String getNote() {
        return note;
    }

    public void setNote(String note) {
        this.note = note;
    }

    public Boolean getIsSystem() {
        return isSystem;
    }

    public void setIsSystem(Boolean isSystem) {
        this.isSystem = isSystem;
    }
}
