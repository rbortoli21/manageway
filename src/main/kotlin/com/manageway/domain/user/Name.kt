package com.manageway.domain.user

data class Name(
    val value: String
) {
    init {
        require(value.length in 1..60) { "Name must be between 1 and 60 characters" }
    }
}