package com.manageway.domain.entity.user.records;

import org.springframework.util.Assert;

public record Password(String value) {
    public Password {
        Assert.hasText(value, "Password must not be empty");
    }
}
