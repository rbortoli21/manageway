package com.manageway.application.repository.impl.user;

import com.manageway.domain.entity.user.User;
import com.manageway.application.repository.impl.AbstractBaseRepositoryImpl;
import com.manageway.domain.repository.user.UserRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

@Repository
public interface UserRepositoryImpl extends AbstractBaseRepositoryImpl<User>, UserRepository {

    @Override
    @Query("SELECT u FROM User u WHERE u.email.value = :email")
    User findByEmail(String email);
}
