package dev.osmanthus.fleet.component.mysql;

import dev.osmanthus.fleet.common.enumeration.DataTypeEnum;
import dev.osmanthus.fleet.common.parameter.Parameter;
import dev.osmanthus.fleet.common.parameter.ParameterProperty;

import java.util.List;

public class ParameterConvert {
    public static String toWhere(Parameter parameter) {
        StringBuilder where = new StringBuilder("1=1");
        List<ParameterProperty> parameterProperties = parameter.getProperties();
        if (parameterProperties != null) {
            parameterProperties.forEach(parameterProperty -> {
                String key = parameterProperty.getKey();
                Object value = parameterProperty.getValue();
                DataTypeEnum dataType = parameterProperty.getDataType();

                if (value == null) {
                    return;
                }
                where.append(" AND ");
                if (dataType == DataTypeEnum.MODEL) {
                    where.append(key);
                    where.append("=");
                    where.append(value.toString());
                }
            });
        }

        return where.toString();
    }
}
