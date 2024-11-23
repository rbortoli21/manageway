package com.manageway.application.usecase.customer;

import com.manageway.domain.entity.Id;
import com.manageway.domain.entity.customer.Customer;
import com.manageway.domain.repository.customer.CustomerRepository;
import org.springframework.stereotype.Service;

@Service
public class FindCustomerUseCase {

    private final CustomerRepository customerRepository;

    public FindCustomerUseCase(CustomerRepository customerRepository) {
        this.customerRepository = customerRepository;
    }

    public Customer find(Id id) {
        return customerRepository.find(id);
    }
}
