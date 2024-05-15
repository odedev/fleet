package dev.osmanthus.fleet.tool.develop.entity;

import dev.osmanthus.fleet.common.entity.AbstractEntity;

public class Enumeration extends AbstractEntity {
    private String id;
    private String code;
    private String name;
    private String fullName;
    private String module;

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

    public String getModule() {
        return module;
    }

    public void setModule(String module) {
        this.module = module;
    }
}
