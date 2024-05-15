package dev.osmanthus.fleet.core.asset.enumeration;

import com.fasterxml.jackson.annotation.JsonValue;

import java.util.Arrays;
import java.util.Objects;

public enum LocationEnum {
    HOST(0, "Host"),
    MINIO(1, "Minio");

    @JsonValue
    private final Integer value;
    private final String name;

    LocationEnum(Integer value, String name) {
        this.value = value;
        this.name = name;
    }

    public Integer getValue() {
        return value;
    }

    public String getName() {
        return name;
    }

    public static LocationEnum getByValue(Integer value){
        return Arrays.stream(LocationEnum.values())
            .filter(item -> Objects.equals(item.value, value))
            .findFirst()
            .orElse(null);
    }
}
