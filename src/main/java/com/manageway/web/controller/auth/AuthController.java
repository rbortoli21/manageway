package com.manageway.web.controller.auth;

import com.manageway.domain.entity.user.User;
import com.manageway.application.usecase.auth.AuthenticateUseCase;
import com.manageway.application.usecase.auth.RegisterUserUseCase;
import com.manageway.web.controller.user.dtos.AuthenticateUserRequest;
import com.manageway.web.controller.user.dtos.AuthenticateUserResponse;
import com.manageway.web.controller.user.dtos.RegisterUserRequest;
import com.manageway.web.controller.user.dtos.RegisterUserResponse;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/auth")
public class AuthController {

    private final RegisterUserUseCase registerUserUseCase;
    private final AuthenticateUseCase authenticateUseCase;

    public AuthController(RegisterUserUseCase registerUserUseCase, AuthenticateUseCase authenticateUseCase) {
        this.registerUserUseCase = registerUserUseCase;
        this.authenticateUseCase = authenticateUseCase;
    }

    @PostMapping("/authenticate")
    public AuthenticateUserResponse authenticate(@RequestBody AuthenticateUserRequest request) {
        return new AuthenticateUserResponse(authenticateUseCase.authenticate(request));
    }

    @PostMapping("/register")
    public RegisterUserResponse register(@RequestBody RegisterUserRequest request) {
        User user = registerUserUseCase.register(request);

        return RegisterUserResponse.from(user.getEmail().value(), null);
    }
}
