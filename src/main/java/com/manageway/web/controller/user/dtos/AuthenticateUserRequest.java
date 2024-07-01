package com.manageway.web.controller.user.dtos;

import org.springframework.util.Assert;

public class AuthenticateUserRequest {
    private String login;
    private String password;

    public AuthenticateUserRequest(String login, String password) {
        this.login = login;
        this.password = password;
        validateFields();
        trimFields();
    }

    public String getLogin() {
        return login;
    }

    public void setLogin(String login) {
        this.login = login;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    private void validateFields() {
        Assert.notNull(this.login, "Login must not be null");
        Assert.notNull(this.password, "Password must not be null");
    }

    private void trimFields() {
        this.login = this.login.trim();
        this.password = this.password.trim();
    }
}
