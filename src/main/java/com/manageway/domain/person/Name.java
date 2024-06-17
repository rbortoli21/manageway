package com.manageway.domain.person;

import com.manageway.StaticUtils;
public record Name(String value) {
    public Name {
        StaticUtils.validateNotNullAndNotEmpty(value, "Name must not be null or empty");
    }
}
