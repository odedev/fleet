package dev.odes.fleet.common.utils;

import com.google.common.base.CaseFormat;

public class CaseFormatUtils {

    // snake_case
    // lower_underscore
    public static String LOWER_UNDERSCORE(String word) {
        String str = "";
        CaseFormat.LOWER_CAMEL.to(CaseFormat.LOWER_UNDERSCORE, word);
        return str;
    }

    // UpperCamelCase
    // UpperCamel
    public static String UPPER_CAMEL(String word) {
        String str = "";
        CaseFormat.LOWER_CAMEL.to(CaseFormat.UPPER_CAMEL, word);
        return str;
    }

    // UPPER_UNDERSCORE
    public static String UPPER_UNDERSCORE(String word) {
        String str = "";
        CaseFormat.LOWER_CAMEL.to(CaseFormat.UPPER_UNDERSCORE, word);
        return str;
    }

    // lowerCamelCase
    // lowerCamel
    public static String LOWER_CAMEL(String word) {
        String str = "";
        CaseFormat.UPPER_CAMEL.to(CaseFormat.LOWER_CAMEL, word);
        return str;
    }


}
