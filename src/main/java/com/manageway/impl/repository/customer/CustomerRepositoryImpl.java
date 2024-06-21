package com.manageway.impl.repository.customer;

import com.manageway.domain.Id;
import com.manageway.domain.customer.Customer;
import com.manageway.domain.repository.customer.CustomerRepository;
import org.jooq.DSLContext;
import org.springframework.stereotype.Repository;

import static com.manageway.jooq.public_.tables.Customer.CUSTOMER;

@Repository
public class CustomerRepositoryImpl implements CustomerRepository {
    private final DSLContext dslContext;

    public CustomerRepositoryImpl(DSLContext dslContext) {
        this.dslContext = dslContext;
    }

    @Override
    public Customer save(Customer entity) {
        return null;
    }

    @Override
    public void update(Customer entity) {

    }

    @Override
    public Customer find(Id id) {
        return dslContext.selectFrom(CUSTOMER)
                .where(CUSTOMER.ID.eq(id.value()))
                .fetchOneInto(Customer.class);
    }

    @Override
    public void delete(Customer entity) {

    }
}
