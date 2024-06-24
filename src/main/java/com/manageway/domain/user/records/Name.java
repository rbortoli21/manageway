package com.manageway.domain.user.records;

import com.manageway.StaticUtils;

public record Name(String value) {
    public Name {
        StaticUtils.validateNotNullAndNotEmpty(value, "Name must not be null or empty");
    }
}
