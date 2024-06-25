package com.manageway.domain.user;

import com.manageway.web.exception.ManagewayValidationException;

public enum Role {
    ADMIN, EMPLOYEE, CUSTOMER;

    public static Role byName(String role) {
        try {
            return Role.valueOf(role.toUpperCase());
        } catch (Exception e) {
            throw new ManagewayValidationException("Role must be one of ADMIN, EMPLOYEE, CUSTOMER");
        }
    }
}
