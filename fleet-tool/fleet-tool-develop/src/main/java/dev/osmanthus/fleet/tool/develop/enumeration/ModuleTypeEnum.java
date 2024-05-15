package dev.osmanthus.fleet.tool.develop.enumeration;

import com.fasterxml.jackson.annotation.JsonValue;

import java.util.Arrays;
import java.util.Objects;

public enum ModuleTypeEnum {
    CORE(0, "core"),
    MODULE(1, "module");

    @JsonValue
    private final Integer value;
    private final String name;


    ModuleTypeEnum(Integer value, String name) {
        this.value = value;
        this.name = name;
    }

    public Integer getValue() {
        return value;
    }

    public String getName() {
        return name;
    }

    public static ModuleTypeEnum getByValue(Integer value){
        return Arrays.stream(ModuleTypeEnum.values())
            .filter(item -> Objects.equals(item.value, value))
            .findFirst()
            .orElse(null);
    }

}
