package dev.odes.fleet.develop.entity;

import dev.odes.fleet.common.entity.AbstractEntity;

/**
 * package: dev.odes.fleet.develop.entity
 * class: EnumerationValue
 * date: 2023/5/6 20:42
 * version: 1.0.0
 * description:
 */
public class EnumerationValue extends AbstractEntity {
    private String id;
    private Integer value;
    private String name;
    private String enumeration;

    @Override
    public String getId() {
        return id;
    }

    @Override
    public void setId(String id) {
        this.id = id;
    }

    public Integer getValue() {
        return value;
    }

    public void setValue(Integer value) {
        this.value = value;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getEnumeration() {
        return enumeration;
    }

    public void setEnumeration(String enumeration) {
        this.enumeration = enumeration;
    }
}
