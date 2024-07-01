package com.manageway.usecase.user;

import com.manageway.domain.user.Role;
import com.manageway.domain.user.User;
import com.manageway.repository.interfaces.user.UserRepository;
import com.manageway.usecase.customer.CreateCustomerUseCase;
import com.manageway.usecase.employee.CreateEmployeeUseCase;
import org.springframework.stereotype.Service;

@Service
public class CreateUserUseCase {
    private final UserRepository userRepository;
    private final CreateEmployeeUseCase createEmployeeUseCase;
    private final CreateCustomerUseCase createCustomerUseCase;

    public CreateUserUseCase(UserRepository userRepository, CreateEmployeeUseCase createEmployeeUseCase, CreateCustomerUseCase createCustomerUseCase) {
        this.userRepository = userRepository;
        this.createEmployeeUseCase = createEmployeeUseCase;
        this.createCustomerUseCase = createCustomerUseCase;
    }

    public User create(User user) {
        user = userRepository.save(user);

        Role userRole = user.getRole();
        switch (userRole) {
            case CUSTOMER -> createCustomerUseCase.createFromUser(user);
            case EMPLOYEE -> createEmployeeUseCase.createFromUser(user);
        }

        return user;
    }
}
