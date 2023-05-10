package dev.odes.fleet.develop.generator;

import dev.odes.fleet.common.enumeration.DataTypeEnum;
import dev.odes.fleet.develop.model.EnumerationModel;
import dev.odes.fleet.develop.model.ModelFieldModel;
import dev.odes.fleet.develop.model.ModelModel;

public class DataTypeUtils {
    public static String getDataType(ModelFieldModel modelField) {
        String type = "";
        DataTypeEnum dataType = modelField.getDataType();
        switch (dataType) {
            case BOOLEAN -> {
                type = "Boolean";
            }
            case STRING, TEXT -> {
                type = "String";
            }
            case INTEGER -> {
                type = "Integer";
            }
            case FLOAT -> {
                type = "Double";
            }
            case DATE -> {
                type = "Date";
            }
            case ENUM -> {
                EnumerationModel enumType = modelField.getEnumType();
                type = enumType.getCode();
            }
            case MODEL -> {
                ModelModel modelType = modelField.getModelType();
                type = modelType.getCode();
            }
            case JSON -> {
                type = "Object";
            }
        }

        return type;
    }
}
