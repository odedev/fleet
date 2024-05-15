package dev.osmanthus.fleet.tool.develop.model;

import dev.osmanthus.fleet.common.model.AbstractModel;
import dev.osmanthus.fleet.tool.develop.entity.EnumerationValue;

public class EnumerationValueModel extends AbstractModel<EnumerationValue> {
    private String id;
    private String code;
    private String name;
    private Integer value;
    private EnumerationModel enumeration;

    public EnumerationValueModel() {
    }

    public EnumerationValueModel(EnumerationValue enumerationValue) {
        this.fromEntity(enumerationValue);
    }

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

    public Integer getValue() {
        return value;
    }

    public void setValue(Integer value) {
        this.value = value;
    }

    public EnumerationModel getEnumeration() {
        return enumeration;
    }

    public void setEnumeration(EnumerationModel enumeration) {
        this.enumeration = enumeration;
    }

    public void setEnumeration(String enumeration) {
        if (enumeration == null) {
            this.enumeration = null;
        } else {
            EnumerationModel enumerationModel = new EnumerationModel();
            enumerationModel.setId(enumeration);
            this.enumeration = enumerationModel;
        }
    }

    @Override
    public void fromEntity(EnumerationValue enumerationValue) {
        if (enumerationValue == null) {
            return;
        }
        this.setId(enumerationValue.getId());
        this.setCode(enumerationValue.getCode());
        this.setName(enumerationValue.getName());
        this.setValue(enumerationValue.getValue());
        this.setEnumeration(enumerationValue.getEnumeration());
    }

    @Override
    public EnumerationValue toEntity() {
        EnumerationValue enumerationValue = new EnumerationValue();
        enumerationValue.setId(this.getId());
        enumerationValue.setCode(this.getCode());
        enumerationValue.setName(this.getName());
        enumerationValue.setValue(this.getValue());

        EnumerationModel enumerationModel = this.getEnumeration();
        if (enumerationModel != null) {
            enumerationValue.setEnumeration(enumerationModel.getId());
        }
        return enumerationValue;
    }
}
