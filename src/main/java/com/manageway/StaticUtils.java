package com.manageway;

import org.springframework.util.Assert;

public class StaticUtils {
    public static void validateNotNullAndNotEmpty(String value, String message) {
        Assert.notNull(value, message);
        Assert.isTrue(!value.isBlank(), message);
    }

    public static String toSnakeCase(String value) {
        return value.replaceAll("([a-z])([A-Z]+)", "$1_$2").toLowerCase();
    }
}
