package com.manageway.repository.interfaces.employee;

import com.manageway.domain.Id;
import com.manageway.domain.employee.Employee;
import com.manageway.repository.interfaces.BaseRepository;

public interface EmployeeRepository extends BaseRepository<Employee> {
    Employee find(Id id);
}
