package dev.odes.fleet.develop.entity;

import dev.odes.fleet.common.entity.AbstractEntity;

public class ModelField extends AbstractEntity {
    private String id;
    private String code;
    private String name;
    private Integer dataType;
    private Integer length;
    private String defaultValue;
    private String dataEnum;
    private String dataModel;
    private Boolean isNullable;
    private Boolean isSearchable;
    private Boolean isDefaultDisplay;
    private Boolean isSlaveModel;
    private String model;

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

    public Integer getDataType() {
        return dataType;
    }

    public void setDataType(Integer dataType) {
        this.dataType = dataType;
    }

    public Integer getLength() {
        return length;
    }

    public void setLength(Integer length) {
        this.length = length;
    }

    public String getDefaultValue() {
        return defaultValue;
    }

    public void setDefaultValue(String defaultValue) {
        this.defaultValue = defaultValue;
    }

    public String getDataEnum() {
        return dataEnum;
    }

    public void setDataEnum(String dataEnum) {
        this.dataEnum = dataEnum;
    }

    public String getDataModel() {
        return dataModel;
    }

    public void setDataModel(String dataModel) {
        this.dataModel = dataModel;
    }

    public Boolean getNullable() {
        return isNullable;
    }

    public void setNullable(Boolean nullable) {
        isNullable = nullable;
    }

    public Boolean getSearchable() {
        return isSearchable;
    }

    public void setSearchable(Boolean searchable) {
        isSearchable = searchable;
    }

    public Boolean getDefaultDisplay() {
        return isDefaultDisplay;
    }

    public void setDefaultDisplay(Boolean defaultDisplay) {
        isDefaultDisplay = defaultDisplay;
    }

    public Boolean getSlaveModel() {
        return isSlaveModel;
    }

    public void setSlaveModel(Boolean slaveModel) {
        isSlaveModel = slaveModel;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }
}
