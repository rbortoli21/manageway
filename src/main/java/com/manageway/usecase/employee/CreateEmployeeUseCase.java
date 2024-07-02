package com.manageway.usecase.employee;

import com.manageway.domain.employee.Employee;
import com.manageway.domain.user.User;
import com.manageway.repository.interfaces.employee.EmployeeRepository;
import org.springframework.stereotype.Service;

import java.util.ArrayList;

@Service
public class CreateEmployeeUseCase {

    private final EmployeeRepository employeeRepository;

    public CreateEmployeeUseCase(EmployeeRepository employeeRepository) {
        this.employeeRepository = employeeRepository;
    }

    public void createFromUser(User user) {
        Employee employee = new Employee(0.0, new ArrayList<>(), new ArrayList<>(), user);
        employee.setTenantId(user.getTenantId());
        employeeRepository.save(employee);
    }
}
