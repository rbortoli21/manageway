package com.manageway.usecase.user;

import com.manageway.domain.user.User;
import com.manageway.domain.user.records.Password;
import com.manageway.web.controller.user.dtos.RegisterUserRequest;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@Service
public class RegisterUserUseCase {

    private final CreateUserUseCase createUserUseCase;
    private final PasswordEncoder passwordEncoder;

    public RegisterUserUseCase(CreateUserUseCase createUserUseCase, PasswordEncoder passwordEncoder) {
        this.createUserUseCase = createUserUseCase;
        this.passwordEncoder = passwordEncoder;
    }


    @Transactional
    public User register(RegisterUserRequest request) {
        User user = request.toUser();

        String passwordEncrypted = passwordEncoder.encode(request.getPassword());
        Password password = new Password(passwordEncrypted);
        user.setPassword(password);

        return createUserUseCase.create(user);
    }
}
