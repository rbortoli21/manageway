package com.manageway.domain.entity.user.records;

import org.springframework.util.Assert;

public record Phone(String value) {
    public Phone {
        if (value != null && !value.isBlank()) {
            validate(value);
        }
    }

    private void validate(String value) {
        String validRegex = "^\\+?[0-9\\-\\s]+$";
        Assert.isTrue(value.matches(validRegex),
                String.format("Phone must be valid, but was %s", value));
    }
}
