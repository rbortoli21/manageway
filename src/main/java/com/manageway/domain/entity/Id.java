package com.manageway.domain.entity;

import com.fasterxml.jackson.annotation.JsonValue;

import java.util.UUID;

public record Id(@JsonValue UUID value) {
    public static final String ID = "id";

    public Id() {
        this(null);
    }

    public Id {
        value = value == null ? UUID.randomUUID() : value;
    }
}
