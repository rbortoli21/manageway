package com.manageway.web.controller.user.dtos;

import com.manageway.domain.user.Role;
import com.manageway.domain.user.User;
import com.manageway.domain.user.records.Email;
import com.manageway.domain.user.records.Name;
import com.manageway.domain.user.records.Password;
import org.springframework.util.Assert;

public class RegisterUserRequest {
    private String name;
    private String email;
    private String password;
    private String role;

    public RegisterUserRequest(String name, String email, String password, String role) {
        this.name = name;
        this.email = email;
        this.password = password;
        this.role = role;
        validateFields();
    }

    public User toUser() {
        User user = new User();

        user.setName(new Name(name));
        user.setEmail(new Email(email));
        user.setPassword(new Password(password));
        user.setRole(Role.byName(role));

        return user;
    }

    public void validateFields() {
        Assert.notNull(this.name, "Name must not be null");
        Assert.notNull(this.email, "Email must not be null");
        Assert.notNull(this.password, "Password must not be null");
        Assert.notNull(this.role, "Role must not be null");
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getRole() {
        return role;
    }

    public void setRole(String role) {
        this.role = role;
    }
}
