package com.manageway.web.controller.user;

import com.manageway.domain.user.User;
import com.manageway.usecase.user.AuthenticateUserUseCase;
import com.manageway.usecase.user.RegisterUserUseCase;
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
    private final AuthenticateUserUseCase authenticateUserUseCase;

    public AuthController(RegisterUserUseCase registerUserUseCase, AuthenticateUserUseCase authenticateUserUseCase) {
        this.registerUserUseCase = registerUserUseCase;
        this.authenticateUserUseCase = authenticateUserUseCase;
    }

    @PostMapping("/authenticate")
    public AuthenticateUserResponse authenticate(@RequestBody AuthenticateUserRequest request) {
        return new AuthenticateUserResponse(authenticateUserUseCase.authenticate(request));
    }

    @PostMapping("/register")
    public RegisterUserResponse register(@RequestBody RegisterUserRequest request) {
        User user = registerUserUseCase.register(request);

        return RegisterUserResponse.from(user.getEmail().value(), null);
    }
}
