package com.manageway.domain;


import com.fasterxml.jackson.annotation.JsonValue;

import java.util.UUID;

public record TenantId(@JsonValue UUID value) {
    public static String TENANT_ID = "tenant_id";
    public TenantId() {
        this(null);
    }

    public TenantId {
        value = value == null ? UUID.randomUUID() : value;
    }
}
