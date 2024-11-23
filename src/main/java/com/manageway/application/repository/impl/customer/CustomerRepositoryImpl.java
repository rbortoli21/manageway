package com.manageway.application.repository.impl.customer;

import com.manageway.domain.entity.customer.Customer;
import com.manageway.application.repository.impl.AbstractBaseRepositoryImpl;
import com.manageway.domain.repository.customer.CustomerRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface CustomerRepositoryImpl extends AbstractBaseRepositoryImpl<Customer>, CustomerRepository {

}
