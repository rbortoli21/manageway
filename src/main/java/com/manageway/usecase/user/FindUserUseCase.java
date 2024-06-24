package com.manageway.usecase.user;

import com.manageway.domain.Id;
import com.manageway.domain.user.User;
import org.jooq.DSLContext;
import org.springframework.stereotype.Service;

import java.util.UUID;

import static com.manageway.generated.jooq.public_.tables.Customer.CUSTOMER;
import static com.manageway.generated.jooq.public_.tables.Employee.EMPLOYEE;

@Service
public class FindUserUseCase {

    private final DSLContext dslContext;

    public FindUserUseCase(DSLContext dslContext) {
        this.dslContext = dslContext;
    }

    public User findUserById(String id) {
        Id queryId = new Id(UUID.fromString(id));
        return dslContext.select()
                .from(CUSTOMER, EMPLOYEE)
                .where(CUSTOMER.ID.eq(queryId.value()).or(EMPLOYEE.ID.eq(queryId.value())))
                .fetchOneInto(User.class);
    }
}
