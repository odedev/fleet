package dev.odes.fleet.develop.model;

import dev.odes.fleet.common.model.AbstractModel;
import dev.odes.fleet.develop.entity.EnumerationValue;

public class EnumerationValueModel extends AbstractModel<EnumerationValue> {
    private String id;
    private Integer value;
    private String name;
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
        this.setValue(enumerationValue.getValue());
        this.setName(enumerationValue.getName());
        this.setEnumeration(enumerationValue.getEnumeration());
    }

    @Override
    public EnumerationValue toEntity() {
        EnumerationValue enumerationValue = new EnumerationValue();
        enumerationValue.setId(this.getId());
        enumerationValue.setValue(this.getValue());
        enumerationValue.setName(this.getName());

        EnumerationModel enumerationModel = this.getEnumeration();
        if (enumerationModel != null) {
            enumerationValue.setEnumeration(enumerationModel.getId());
        }
        return enumerationValue;
    }
}
