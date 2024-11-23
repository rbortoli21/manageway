package com.manageway.application.usecase.employee;

import com.manageway.domain.entity.employee.Employee;
import com.manageway.domain.entity.user.User;
import com.manageway.domain.repository.employee.EmployeeRepository;
import org.springframework.stereotype.Service;

@Service
public class CreateEmployeeUseCase {

    private final EmployeeRepository employeeRepository;

    public CreateEmployeeUseCase(EmployeeRepository employeeRepository) {
        this.employeeRepository = employeeRepository;
    }

    public void createFromUser(User user) {
        Employee employee = new Employee.EmployeeBuilder()
                .withUser(user)
                .withBalance(0.0)
                .build();

        employeeRepository.persist(employee);
    }
}
