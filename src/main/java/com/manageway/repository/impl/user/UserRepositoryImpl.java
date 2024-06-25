package com.manageway.repository.impl.user;

import com.manageway.domain.user.User;
import com.manageway.repository.impl.AbstractBaseRepositoryImpl;
import com.manageway.repository.interfaces.user.UserRepository;
import org.jooq.DSLContext;
import org.springframework.stereotype.Repository;

import static com.manageway.generated.jooq.public_.tables.Users.USERS;

@Repository
public class UserRepositoryImpl extends AbstractBaseRepositoryImpl<User> implements UserRepository {

    protected UserRepositoryImpl(DSLContext dslContext) {
        super(dslContext, USERS, User.class);
    }
}
