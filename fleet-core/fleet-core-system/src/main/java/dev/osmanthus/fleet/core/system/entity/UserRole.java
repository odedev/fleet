package dev.osmanthus.fleet.core.system.entity;

import dev.osmanthus.fleet.common.entity.AbstractEntity;

public class UserRole extends AbstractEntity {
    private String id;
    private String user;
    private String role;

    @Override
    public String getId() {
        return id;
    }

    @Override
    public void setId(String id) {
        this.id = id;
    }

    public String getUser() {
        return user;
    }

    public void setUser(String user) {
        this.user = user;
    }

    public String getRole() {
        return role;
    }

    public void setRole(String role) {
        this.role = role;
    }
}
