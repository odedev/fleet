package dev.odes.fleet.mysql;

import dev.odes.fleet.common.enumeration.DataTypeEnum;
import dev.odes.fleet.common.parameter.Parameter;
import dev.odes.fleet.common.parameter.ParameterProperty;

import java.util.List;

/**
 * package: dev.odes.fleet.mysql
 * class: ParameterConvert
 * date: 2023/5/7 0:43
 * version: 1.0.0
 * description:
 */
public class ParameterConvert {
    public static String toWhere(Parameter parameter) {
        StringBuilder where = new StringBuilder();
        List<ParameterProperty> parameterProperties = parameter.getProperties();
        parameterProperties.forEach(parameterProperty -> {
            String key = parameterProperty.getKey();
            Object value = parameterProperty.getValue();
            DataTypeEnum dataType = parameterProperty.getDataType();
            if (!where.isEmpty()) {
                where.append(" AND ");
            }
            if (dataType == DataTypeEnum.MODEL) {
                where.append(key);
                where.append("=");
                where.append(value.toString());
            }
        });
        return where.toString();
    }
}
