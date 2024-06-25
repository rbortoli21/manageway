package com.manageway.usecase.user;

import com.manageway.domain.Id;
import com.manageway.domain.user.User;
import com.manageway.repository.interfaces.user.UserRepository;
import org.springframework.stereotype.Service;

import java.util.UUID;

@Service
public class FindUserUseCase {
    private final UserRepository userRepository;

    public FindUserUseCase(UserRepository userRepository) {
        this.userRepository = userRepository;
    }

    public User find(String id) {
        Id userId = new Id(UUID.fromString(id));
        return userRepository.find(userId);
    }
}
