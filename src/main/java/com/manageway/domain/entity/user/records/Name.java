package com.manageway.domain.entity.user.records;

import org.springframework.util.Assert;

public record Name(String value) {
    public Name {
        Assert.notNull(value, "Name must be provided.");
        Assert.isTrue(value.length() >= 3 && value.length() <= 50,
                String.format("Name must be between 3 and 50 characters, but was %s", value));
    }
}
