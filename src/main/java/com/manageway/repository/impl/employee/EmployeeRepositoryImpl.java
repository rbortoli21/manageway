package com.manageway.repository.impl.employee;

import com.manageway.domain.employee.Employee;
import com.manageway.repository.impl.AbstractBaseRepositoryImpl;
import com.manageway.repository.interfaces.employee.EmployeeRepository;
import org.jooq.DSLContext;
import org.springframework.stereotype.Repository;

import static com.manageway.generated.jooq.public_.tables.Employee.EMPLOYEE;

@Repository
public class EmployeeRepositoryImpl extends AbstractBaseRepositoryImpl<Employee> implements EmployeeRepository {

    public EmployeeRepositoryImpl(DSLContext dslContext) {
        super(dslContext, EMPLOYEE, Employee.class);
    }

}
