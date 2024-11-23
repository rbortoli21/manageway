package com.manageway.application.repository.impl.employee;

import com.manageway.domain.entity.employee.Employee;
import com.manageway.application.repository.impl.AbstractBaseRepositoryImpl;
import com.manageway.domain.repository.employee.EmployeeRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface EmployeeRepositoryImpl extends AbstractBaseRepositoryImpl<Employee>, EmployeeRepository {

}
