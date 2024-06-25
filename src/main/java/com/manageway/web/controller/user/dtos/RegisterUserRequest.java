package com.manageway.web.controller.user.dtos;

import com.manageway.domain.user.Role;
import com.manageway.domain.user.User;
import com.manageway.domain.user.records.Email;
import com.manageway.domain.user.records.Name;
import com.manageway.domain.user.records.Password;
import org.springframework.util.Assert;

public record RegisterUserRequest(
        String name,
        String email,
        String password,
        String role
) {
    public RegisterUserRequest {
        Assert.notNull(name, "Name must not be null");
        Assert.notNull(email, "Email must not be null");
        Assert.notNull(password, "Password must not be null");
        Assert.notNull(role, "Role must not be null");
    }

    public User toUser() {
        User user = new User();

        user.setName(new Name(name));
        user.setEmail(new Email(email));
        user.setPassword(new Password(password));
        user.setRole(Role.byName(role));

        return user;
    }
}
