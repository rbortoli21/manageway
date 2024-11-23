package com.manageway.application.usecase.user;

import com.manageway.domain.entity.Id;
import com.manageway.domain.entity.user.User;
import com.manageway.application.UserDetailsImpl;
import com.manageway.domain.repository.user.UserRepository;
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

    public User findByEmail(String email) {
        return userRepository.findByEmail(email);
    }

    public UserDetailsImpl findUserDetails(String username) {
        User user = findByEmail(username);
        return new UserDetailsImpl(user);
    }

}
