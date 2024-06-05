package com.manageway.domain.user

data class Phone(
    val value: String
) {
    init {
        require(value.length in 5..20) { "Phone must be between 5 and 20 characters" }
        require(value.matches(Regex("^[0-9]+\$"))) { "Phone must be valid" }
    }
}
