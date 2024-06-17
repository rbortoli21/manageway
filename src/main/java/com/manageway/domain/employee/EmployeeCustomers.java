package com.manageway.domain.employee;

import com.manageway.domain.PersistenceEntity;
import com.manageway.domain.customer.Customer;

public class EmployeeCustomers extends PersistenceEntity {
    private Employee employee;
    private Customer customer;

    @Override
    public void refreshReferences() {

    }

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
}
