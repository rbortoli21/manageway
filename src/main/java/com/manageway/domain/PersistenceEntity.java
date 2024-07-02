package com.manageway.domain;


import io.jsonwebtoken.lang.Assert;
import org.jooq.UpdatableRecord;

import java.time.LocalDateTime;

public abstract class PersistenceEntity {
    protected Id id = new Id();
    protected LocalDateTime createdAt = LocalDateTime.now();
    protected LocalDateTime updatedAt = LocalDateTime.now();
    protected TenantId tenantId = new TenantId();

    public Id getId() {
        return id;
    }

    public void setId(Id id) {
        this.id = id;
    }

    public LocalDateTime getCreatedAt() {
        return createdAt;
    }

    public void setCreatedAt(LocalDateTime createdAt) {
        this.createdAt = createdAt;
    }

    public LocalDateTime getUpdatedAt() {
        return updatedAt;
    }

    public void setUpdatedAt(LocalDateTime updatedAt) {
        this.updatedAt = updatedAt;
    }

    public TenantId getTenantId() {
        return tenantId;
    }

    public void setTenantId(TenantId tenantId) {
        this.tenantId = tenantId;
    }

    public abstract UpdatableRecord<?> toRecord();

    public void validate() {
        Assert.notNull(id, "Id cannot be null");
        Assert.notNull(tenantId, "TenantId cannot be null");
    }
}
