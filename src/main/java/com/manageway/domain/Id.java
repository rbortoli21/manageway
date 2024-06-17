package com.manageway.domain;

import com.fasterxml.jackson.annotation.JsonValue;

import java.util.UUID;

public record Id(@JsonValue UUID value) {
    public Id() {
        this(null);
    }

    public Id {
        value = value == null ? UUID.randomUUID() : value;
    }

    public UUID value() {
        return value;
    }
}
