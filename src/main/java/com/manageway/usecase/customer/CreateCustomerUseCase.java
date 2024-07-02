package com.manageway.usecase.customer;

import com.manageway.domain.customer.Customer;
import com.manageway.domain.user.User;
import com.manageway.repository.interfaces.customer.CustomerRepository;
import org.springframework.stereotype.Service;

@Service
public class CreateCustomerUseCase {

    private final CustomerRepository customerRepository;

    public CreateCustomerUseCase(CustomerRepository customerRepository) {
        this.customerRepository = customerRepository;
    }

    public void createFromUser(User user) {
        Customer customer = new Customer(user);
        customer.setTenantId(user.getTenantId());

        customerRepository.save(customer);
    }
}
