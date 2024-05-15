package dev.osmanthus.fleet.core.system.entity;

import dev.osmanthus.fleet.common.entity.AbstractEntity;

public class RoleMenu extends AbstractEntity {
    private String id;
    private String role;
    private String menu;

    @Override
    public String getId() {
        return id;
    }

    @Override
    public void setId(String id) {
        this.id = id;
    }

    public String getRole() {
        return role;
    }

    public void setRole(String role) {
        this.role = role;
    }

    public String getMenu() {
        return menu;
    }

    public void setMenu(String menu) {
        this.menu = menu;
    }
}
