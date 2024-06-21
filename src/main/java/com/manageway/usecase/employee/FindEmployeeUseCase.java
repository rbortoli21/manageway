package com.manageway.usecase.employee;

import com.manageway.domain.Id;
import com.manageway.domain.employee.Employee;
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

    public Employee find(Employee employee) {
        if (employee.getId() == null) {
            return null;
        }
        return employeeRepository.find(employee.getId());
    }
}
