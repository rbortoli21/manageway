package com.manageway.domain.employee;

import com.manageway.domain.Id;
import com.manageway.domain.person.Person;
import org.springframework.expression.spel.ast.Identifier;

import java.util.List;

public class Employee extends Person {
    private Double balance;
    private List<EmployeeCustomers> customers;
    private List<EmployeeProjects> projects;

    @Override
    public void refreshReferences() {

    }

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
}
