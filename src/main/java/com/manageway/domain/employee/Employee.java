package com.manageway.domain.employee;

import com.manageway.domain.Id;
import com.manageway.domain.user.User;
import org.springframework.security.core.GrantedAuthority;
import org.springframework.security.core.authority.SimpleGrantedAuthority;

import java.util.Collection;
import java.util.List;

public class Employee extends User {
    private Double balance;
    private List<EmployeeCustomers> customers;
    private List<EmployeeProjects> projects;

    public Employee() {
    }

    public Employee(Id id) {
        this.id = id;
    }

    public Employee(Double balance, List<EmployeeCustomers> customers, List<EmployeeProjects> projects) {
        this.balance = balance;
        this.customers = customers;
        this.projects = projects;
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

    @Override
    public void refreshReferences() {

    }

    @Override
    public Collection<? extends GrantedAuthority> getAuthorities() {
        return List.of(new SimpleGrantedAuthority(super.getRole().name()));
    }

    @Override
    public String getPassword() {
        return super._getPassword().value();
    }

    @Override
    public String getUsername() {
        return super._getUsername().value();
    }
}
