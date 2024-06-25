package com.manageway.web.controller.user.dtos;

public record RegisterUserResponse(
        String email,
        String jwtToken
) {
    public static RegisterUserResponse from(String name, String jwtToken) {
        return new RegisterUserResponse(name, jwtToken);
    }
}
