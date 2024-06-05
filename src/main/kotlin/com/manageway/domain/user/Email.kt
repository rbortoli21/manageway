package com.manageway.domain.user

data class Email(
    val value: String
) {
    init {
        require(value.length in 5..60) { "Email must be between 5 and 60 characters" }
        require(value.matches(Regex("^[A-Za-z0-9+_.-]+@(.+)\$"))) { "Email must be valid" }
    }
}