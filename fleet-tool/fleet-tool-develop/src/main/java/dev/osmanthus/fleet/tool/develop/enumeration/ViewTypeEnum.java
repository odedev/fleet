package dev.osmanthus.fleet.tool.develop.enumeration;

import com.fasterxml.jackson.annotation.JsonValue;

import java.util.Arrays;
import java.util.Objects;

public enum ViewTypeEnum {
    VIEW(0, "VIEW"),
    DIALOG(1, "DIALOG");

    @JsonValue
    private final Integer value;
    private final String name;

    ViewTypeEnum(Integer value, String name) {
        this.value = value;
        this.name = name;
    }

    public Integer getValue() {
        return value;
    }

    public String getName() {
        return name;
    }

    public static ViewTypeEnum getByValue(Integer value){
        return Arrays.stream(ViewTypeEnum.values())
            .filter(item -> Objects.equals(item.value, value))
            .findFirst()
            .orElse(null);
    }
}
