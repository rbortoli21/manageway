package com.manageway.usecase.user;

import com.manageway.domain.user.User;
import com.manageway.repository.interfaces.user.UserRepository;
import org.springframework.stereotype.Service;

@Service
public class CreateUserUseCase {
    private final UserRepository userRepository;

    public CreateUserUseCase(UserRepository userRepository) {
        this.userRepository = userRepository;
    }

    public User create(User user) {
        return userRepository.save(user);
    }
}
