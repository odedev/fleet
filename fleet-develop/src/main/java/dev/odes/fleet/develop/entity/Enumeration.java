package dev.odes.fleet.develop.entity;

import dev.odes.fleet.common.entity.AbstractEntity;

/**
 * package: dev.odes.fleet.develop.entity
 * class: Enumeration
 * date: 2023/5/6 20:42
 * version: 1.0.0
 * description:
 */
public class Enumeration extends AbstractEntity {
    private String id;
    private String code;
    private String name;
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

    public String getModule() {
        return module;
    }

    public void setModule(String module) {
        this.module = module;
    }
}
