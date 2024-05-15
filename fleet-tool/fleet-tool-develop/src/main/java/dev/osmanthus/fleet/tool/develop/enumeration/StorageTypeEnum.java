package dev.osmanthus.fleet.tool.develop.enumeration;

import com.fasterxml.jackson.annotation.JsonValue;

import java.util.Objects;

public enum StorageTypeEnum {
    MYSQL(0, "MYSQL"),
    MONGODB(1, "MONGODB");

    @JsonValue
    private final Integer value;
    private final String name;

    StorageTypeEnum(Integer value, String name) {
        this.value = value;
        this.name = name;
    }

    public Integer getValue() {
        return value;
    }

    public String getName() {
        return name;
    }

    public static StorageTypeEnum getByValue(Integer value){
        for(StorageTypeEnum item : StorageTypeEnum.values()) {
            if(Objects.equals(item.value, value)){
                return item;
            }
        }
        return null;
    }

}
