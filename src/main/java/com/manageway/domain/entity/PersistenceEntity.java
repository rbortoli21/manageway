package com.manageway.domain.entity;


import jakarta.persistence.*;
import org.springframework.util.Assert;

import java.time.LocalDateTime;

@MappedSuperclass
public abstract class PersistenceEntity {
    @EmbeddedId
    protected Id id = new Id();

    protected LocalDateTime createdAt = LocalDateTime.now();
    protected LocalDateTime updatedAt = LocalDateTime.now();
    protected Boolean deleted = false;

    @Embedded
    @AttributeOverride(name = "value", column = @Column(name = "tenant_id"))
    protected TenantId tenantId = new TenantId();


    public Id getId() {
        return id;
    }

    public LocalDateTime getCreatedAt() {
        return createdAt;
    }

    public LocalDateTime getUpdatedAt() {
        return updatedAt;
    }

    public TenantId getTenantId() {
        return tenantId;
    }

    public void setTenantId(TenantId tenantId) {
        this.tenantId = tenantId;
    }

    public void deleteEntity() {
        this.deleted = true;
    }

    public void updateEntity() {
        this.updatedAt = LocalDateTime.now();
    }

    public void validate() {
        Assert.notNull(id, "Id cannot be null");
        Assert.notNull(tenantId, "TenantId cannot be null");
    }
}
