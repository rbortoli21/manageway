package com.manageway.application.usecase.auth;

import com.manageway.domain.entity.user.User;
import com.manageway.application.usecase.user.CreateUserUseCase;
import com.manageway.web.controller.user.dtos.RegisterUserRequest;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.stereotype.Service;

@Service
public class RegisterUserUseCase {

    private final CreateUserUseCase createUserUseCase;
    private final PasswordEncoder passwordEncoder;

    public RegisterUserUseCase(CreateUserUseCase createUserUseCase, PasswordEncoder passwordEncoder) {
        this.createUserUseCase = createUserUseCase;
        this.passwordEncoder = passwordEncoder;
    }

    public User register(RegisterUserRequest request) {
        String passwordEncrypted = passwordEncoder.encode(request.getPassword());
        User user = request.toUser(passwordEncrypted);

        return createUserUseCase.create(user);
    }
}
