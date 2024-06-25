package com.manageway.domain.employee;

import com.manageway.domain.PersistenceEntity;
import com.manageway.domain.customer.Customer;
import com.manageway.generated.jooq.public_.tables.records.EmployeeCustomersRecord;

public class EmployeeCustomers extends PersistenceEntity {
    private Employee employee;
    private Customer customer;

    public EmployeeCustomers() {
    }

    public EmployeeCustomers(Employee employee, Customer customer) {
        this.employee = employee;
        this.customer = customer;
    }

    public Employee getUser() {
        return employee;
    }

    public void setUser(Employee employee) {
        this.employee = employee;
    }

    public Customer getCustomer() {
        return customer;
    }

    public void setCustomer(Customer customer) {
        this.customer = customer;
    }

    @Override
    public EmployeeCustomersRecord toRecord() {
        EmployeeCustomersRecord record = new EmployeeCustomersRecord();

        record.setId(id.value());
        record.setEmployeeId(employee.getId().value());
        record.setCustomerId(customer.getId().value());
        record.setCreatedAt(createdAt);
        record.setUpdatedAt(updatedAt);
        record.setTenantId(tenantId.value());


        return record;
    }
}
