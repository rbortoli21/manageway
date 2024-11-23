package com.manageway.domain.entity.user;

import com.manageway.web.exception.ManagewayValidationException;

public enum Role {
    ADMIN("Admin"), EMPLOYEE("Employee"), CUSTOMER("Customer");

    private final String title;

    Role(String title) {
        this.title = title;
    }

    public String getTitle() {
        return title;
    }

    public static Role byName(String role) {
        try {
            return Role.valueOf(role.toUpperCase());
        } catch (Exception e) {
            throw new ManagewayValidationException("Role must be one of ADMIN, EMPLOYEE, CUSTOMER");
        }
    }
}
