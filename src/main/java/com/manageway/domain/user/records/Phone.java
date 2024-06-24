package com.manageway.domain.user.records;

import com.manageway.StaticUtils;
import org.springframework.util.Assert;

public record Phone(String value) {
    public Phone {
        StaticUtils.validateNotNullAndNotEmpty(value, "Phone must not be null or empty");

        String validRegex = "^\\+?[0-9\\-\\s]+$";
        Assert.isTrue(value.matches(validRegex),
                String.format("Phone must be valid, but was %s", value));
    }
}
