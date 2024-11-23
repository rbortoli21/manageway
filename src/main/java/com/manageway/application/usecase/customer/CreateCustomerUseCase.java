package com.manageway.application.usecase.customer;

import com.manageway.domain.entity.customer.Customer;
import com.manageway.domain.entity.user.User;
import com.manageway.domain.repository.customer.CustomerRepository;
import org.springframework.stereotype.Service;

@Service
public class CreateCustomerUseCase {

    private final CustomerRepository customerRepository;

    public CreateCustomerUseCase(CustomerRepository customerRepository) {
        this.customerRepository = customerRepository;
    }

    public void createFromUser(User user) {
        Customer customer = new Customer.CustomerBuilder()
                .withUser(user)
                .build();
        customerRepository.persist(customer);
    }
}
