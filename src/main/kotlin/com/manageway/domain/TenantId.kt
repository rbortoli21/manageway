package com.manageway.domain

import java.util.UUID

data class TenantId(
    val value: UUID = UUID.randomUUID()
)