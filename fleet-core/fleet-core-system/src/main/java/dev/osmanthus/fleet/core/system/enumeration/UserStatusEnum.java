package dev.osmanthus.fleet.core.system.enumeration;

import com.fasterxml.jackson.annotation.JsonValue;

import java.util.Arrays;
import java.util.Objects;

public enum UserStatusEnum {
    ADMIN(0, "Admin"),
    NORMAL(1, "Normal");

    @JsonValue
    private final Integer value;
    private final String name;

    UserStatusEnum(Integer value, String name) {
        this.value = value;
        this.name = name;
    }

    public Integer getValue() {
        return value;
    }

    public String getName() {
        return name;
    }

    public static UserStatusEnum getByValue(Integer value){
        return Arrays.stream(UserStatusEnum.values())
            .filter(item -> Objects.equals(item.value, value))
            .findFirst()
            .orElse(null);
    }
}
