package com.manageway.domain

abstract class PersistenceEntity {
    protected val id: Id = Id()
    protected val createdAt: Long = System.currentTimeMillis()
    protected val updatedAt: Long = System.currentTimeMillis()
    protected val tenantId: TenantId = TenantId()

    abstract fun refreshReferences()
}
