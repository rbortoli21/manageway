package com.manageway.repository.impl.customer;

import com.manageway.domain.customer.Customer;
import com.manageway.repository.impl.AbstractBaseRepositoryImpl;
import com.manageway.repository.interfaces.customer.CustomerRepository;
import org.jooq.DSLContext;
import org.springframework.stereotype.Repository;

import static com.manageway.generated.jooq.public_.tables.Customer.CUSTOMER;

@Repository
public class CustomerRepositoryImpl extends AbstractBaseRepositoryImpl<Customer> implements CustomerRepository {

    public CustomerRepositoryImpl(DSLContext dslContext) {
        super(dslContext, CUSTOMER, Customer.class);
    }
}
