package dev.odes.fleet.common.parameter;

import dev.odes.fleet.common.enumeration.DataTypeEnum;

import java.util.List;

/**
 * package: dev.odes.fleet.common.parameter
 * class: ParameterProperty
 * date: 2023/5/6 21:42
 * version: 1.0.0
 * description:
 */
public class ParameterProperty {
    private String key;
    private Object value;
    private List<Object> values;
    private DataTypeEnum dataType;

    public String getKey() {
        return key;
    }

    public void setKey(String key) {
        this.key = key;
    }

    public Object getValue() {
        return value;
    }

    public void setValue(Object value) {
        this.value = value;
    }

    public List<Object> getValues() {
        return values;
    }

    public void setValues(List<Object> values) {
        this.values = values;
    }

    public DataTypeEnum getDataType() {
        return dataType;
    }

    public void setDataType(DataTypeEnum dataType) {
        this.dataType = dataType;
    }
}
