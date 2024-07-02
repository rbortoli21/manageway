package com.manageway.repository.impl.employee;

import com.manageway.domain.Id;
import com.manageway.domain.employee.Employee;
import com.manageway.generated.jooq.public_.tables.records.EmployeeRecord;
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

    @Override
    public Employee find(Id id) {
        EmployeeRecord record = dslContext.selectFrom(EMPLOYEE)
                .where(EMPLOYEE.ID.eq(id.value()))
                .fetchOne();

        assert record != null;
        Employee employee = new Employee(
                record.getId(),
                record.getBalance(),
                null
        );
        return employee;
    }
}
