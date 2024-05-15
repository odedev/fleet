package dev.osmanthus.fleet.common.enumeration;

import com.fasterxml.jackson.annotation.JsonValue;

import java.util.Arrays;
import java.util.Objects;

public enum DataTypeEnum {
    BOOLEAN(0, "Boolean"),
    STRING(1, "String"),
    TEXT(2, "Text"),
    INTEGER(3, "Integer"),
    FLOAT(4, "Float"),
    // decimal(5, "Decimal"),
    DATE(5, "Date"),
    ENUM(6, "Enum"),
    MODEL(7, "Model"),
    JSON(8, "JSON"),
    FILE(9, "File");

    @JsonValue
    private final Integer value;
    private final String name;

    DataTypeEnum(Integer value, String name) {
        this.value = value;
        this.name = name;
    }

    public Integer getValue() {
        return value;
    }

    public String getName() {
        return name;
    }

    public static DataTypeEnum getByValue(Integer value){
        return Arrays.stream(DataTypeEnum.values())
            .filter(item -> Objects.equals(item.value, value))
            .findFirst()
            .orElse(null);
    }

}
