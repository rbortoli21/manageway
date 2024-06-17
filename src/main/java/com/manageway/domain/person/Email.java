package com.manageway.domain.person;

import com.manageway.StaticUtils;
import org.springframework.util.Assert;

public record Email(String value) {
    public Email {
        StaticUtils.validateNotNullAndNotEmpty(value, "Email must not be null or empty");

        String validRegex = "^[a-zA-Z0-9+_.-]+@[a-zA-Z0-9.-]+$";
        Assert.isTrue(value.matches(validRegex),
                String.format("Email must be valid, but was %s", value));
    }
}
