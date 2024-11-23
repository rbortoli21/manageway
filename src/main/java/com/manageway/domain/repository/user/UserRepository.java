package com.manageway.domain.repository.user;

import com.manageway.domain.entity.user.User;
import com.manageway.domain.repository.BaseRepository;

public interface UserRepository extends BaseRepository<User> {
    User findByEmail(String email);
}
