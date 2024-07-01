package com.manageway.domain.employee;

import com.manageway.domain.Id;
import com.manageway.domain.PersistenceEntity;
import com.manageway.domain.user.User;
import com.manageway.generated.jooq.public_.tables.records.EmployeeRecord;

import java.math.BigDecimal;
import java.util.List;

public class Employee extends PersistenceEntity {
    private Double balance;
    private List<EmployeeCustomers> customers;
    private List<EmployeeProjects> projects;
    private User user;

    public Employee(Id id) {
        this.id = id;
    }

    public Employee(Double balance, List<EmployeeCustomers> customers, List<EmployeeProjects> projects, User user) {
        this.balance = balance;
        this.customers = customers;
        this.projects = projects;
        this.user = user;
    }

    public Double getBalance() {
        return balance;
    }

    public void setBalance(Double balance) {
        this.balance = balance;
    }

    public List<EmployeeCustomers> getCustomers() {
        return customers;
    }

    public void setCustomers(List<EmployeeCustomers> customers) {
        this.customers = customers;
    }

    public List<EmployeeProjects> getProjects() {
        return projects;
    }

    public void setProjects(List<EmployeeProjects> projects) {
        this.projects = projects;
    }

    public User getUser() {
        return user;
    }

    public void setUser(User user) {
        this.user = user;
    }

    @Override
    public EmployeeRecord toRecord() {
        EmployeeRecord record = new EmployeeRecord();

        record.setId(id.value());
        record.setBalance(BigDecimal.valueOf(balance));
        record.setCreatedAt(createdAt);
        record.setUpdatedAt(updatedAt);
        record.setTenantId(tenantId.value());
        record.setUserId(user.getId().value());

        return record;
    }
}
