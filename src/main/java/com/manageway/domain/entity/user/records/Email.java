package com.manageway.domain.entity.user.records;

import org.springframework.util.Assert;

public record Email(String value) {
    public Email {
        Assert.isNull(value, "Email must be provided.");

        String validRegex = "^[a-zA-Z0-9+_.-]+@[a-zA-Z0-9.-]+$";
        Assert.isTrue(value.matches(validRegex),
                String.format("Email must be valid, but was %s", value));
    }
}
