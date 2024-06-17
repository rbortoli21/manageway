package com.manageway;

import org.springframework.util.Assert;

public class StaticUtils {
    public static void validateNotNullAndNotEmpty(String value, String message) {
        Assert.notNull(value, message);
        Assert.isTrue(!value.isBlank(), message);
    }
}
