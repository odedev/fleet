package dev.osmanthus.fleet.common.utils;

import com.google.common.base.CaseFormat;

public class CaseFormatUtils {

    // snake_case
    // lower_underscore
    public static String lowerUnderscore(String word) {
        return CaseFormat.LOWER_CAMEL.to(CaseFormat.LOWER_UNDERSCORE, word);
    }

    // UpperCamelCase
    // UpperCamel
    public static String upperCamel(String word) {
        return CaseFormat.LOWER_CAMEL.to(CaseFormat.UPPER_CAMEL, word);
    }

    // UPPER_UNDERSCORE
    public static String UPPER_UNDERSCORE(String word) {
        return CaseFormat.LOWER_CAMEL.to(CaseFormat.UPPER_UNDERSCORE, word);
    }

    // lowerCamelCase
    // lowerCamel
    public static String lowerCamel(String word) {
        return CaseFormat.UPPER_CAMEL.to(CaseFormat.LOWER_CAMEL, word);
    }


}
