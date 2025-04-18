package com.manageway.application.usecase.employee;

import com.manageway.domain.entity.Id;
import com.manageway.domain.entity.employee.Employee;
import com.manageway.domain.repository.employee.EmployeeRepository;
import org.springframework.stereotype.Service;

@Service
public class FindEmployeeUseCase {
    private final EmployeeRepository employeeRepository;

    public FindEmployeeUseCase(EmployeeRepository employeeRepository) {
        this.employeeRepository = employeeRepository;
    }

    public Employee find(Id id) {
        return employeeRepository.find(id);
    }
}
