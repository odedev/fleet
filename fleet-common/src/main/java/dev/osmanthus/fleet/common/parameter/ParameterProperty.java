package dev.osmanthus.fleet.common.parameter;

import dev.osmanthus.fleet.common.enumeration.DataTypeEnum;

import java.util.List;

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
