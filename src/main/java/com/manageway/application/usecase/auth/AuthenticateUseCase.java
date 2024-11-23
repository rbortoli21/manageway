package com.manageway.application.usecase.auth;

import com.manageway.domain.entity.user.User;
import com.manageway.application.usecase.user.FindUserUseCase;
import com.manageway.web.controller.user.dtos.AuthenticateUserRequest;
import com.manageway.web.filter.util.AuthUtil;
import org.springframework.security.authentication.AuthenticationManager;
import org.springframework.security.authentication.UsernamePasswordAuthenticationToken;
import org.springframework.stereotype.Service;

@Service
public class AuthenticateUseCase {
    private final FindUserUseCase findUserUseCase;
    private final AuthenticationManager authenticationManager;
    private final AuthUtil authUtil;

    public AuthenticateUseCase(AuthenticationManager authenticationManager,
                               AuthUtil authUtil,
                               FindUserUseCase findUserUseCase) {
        this.authenticationManager = authenticationManager;
        this.authUtil = authUtil;
        this.findUserUseCase = findUserUseCase;
    }

    public String authenticate(AuthenticateUserRequest request) {
        UsernamePasswordAuthenticationToken token = new UsernamePasswordAuthenticationToken(
                request.getLogin(), request.getPassword()
        );
        authenticationManager.authenticate(token);
        User user = findUserUseCase.findByEmail(request.getLogin());

        return authUtil.generateToken(user.getEmail().value(), user.getTenantId());
    }

}
