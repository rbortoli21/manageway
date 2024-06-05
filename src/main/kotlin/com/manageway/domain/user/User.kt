package com.manageway.domain.user

import com.manageway.domain.PersistenceEntity
import java.time.LocalDateTime

class User(
    var name: Name,
    var email: Email,
    var phone: Phone,
    val birthDate: LocalDateTime
) : PersistenceEntity() {

    override fun refreshReferences() {

    }
}