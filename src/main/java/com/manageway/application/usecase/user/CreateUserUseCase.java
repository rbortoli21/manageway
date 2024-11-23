package com.manageway.application.usecase.user;

import com.manageway.domain.entity.user.Role;
import com.manageway.domain.entity.user.User;
import com.manageway.domain.repository.user.UserRepository;
import com.manageway.application.usecase.customer.CreateCustomerUseCase;
import com.manageway.application.usecase.employee.CreateEmployeeUseCase;
import org.springframework.stereotype.Service;

@Service
public class CreateUserUseCase {
    private final UserRepository userRepository;
    private final CreateEmployeeUseCase createEmployeeUseCase;
    private final CreateCustomerUseCase createCustomerUseCase;

    public CreateUserUseCase(UserRepository userRepository, CreateEmployeeUseCase createEmployeeUseCase,
                             CreateCustomerUseCase createCustomerUseCase) {
        this.userRepository = userRepository;
        this.createEmployeeUseCase = createEmployeeUseCase;
        this.createCustomerUseCase = createCustomerUseCase;
    }

    public User create(User user) {
        user = userRepository.persist(user);

        Role userRole = user.getRole();
        switch (userRole) {
            case CUSTOMER -> createCustomerUseCase.createFromUser(user);
            case EMPLOYEE -> createEmployeeUseCase.createFromUser(user);
        }

        return user;
    }
}
