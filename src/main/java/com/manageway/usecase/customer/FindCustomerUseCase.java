package com.manageway.usecase.customer;

import com.manageway.domain.Id;
import com.manageway.domain.customer.Customer;
import com.manageway.repository.customer.CustomerRepository;
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

    public Customer find(Customer customer) {
        if (customer.getId() == null) {
            return null;
        }
        return customerRepository.find(customer.getId());
    }
}
