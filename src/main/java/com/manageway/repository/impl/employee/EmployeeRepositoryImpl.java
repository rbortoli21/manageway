package com.manageway.repository.impl.employee;

import com.manageway.domain.Id;
import com.manageway.domain.employee.Employee;
import com.manageway.repository.employee.EmployeeRepository;
import org.jooq.DSLContext;
import org.springframework.stereotype.Repository;

import static com.manageway.generated.jooq.public_.tables.Employee.EMPLOYEE;

@Repository
public class EmployeeRepositoryImpl implements EmployeeRepository {

    private final DSLContext dslContext;

    public EmployeeRepositoryImpl(DSLContext dslContext) {
        this.dslContext = dslContext;
    }

    @Override
    public Employee save(Employee entity) {
        return null;
    }

    @Override
    public void update(Employee entity) {

    }

    @Override
    public Employee find(Id id) {
        return dslContext.selectFrom(EMPLOYEE)
                .where(EMPLOYEE.ID.eq(id.value()))
                .fetchOneInto(Employee.class);
    }

    @Override
    public void delete(Employee entity) {

    }
}
