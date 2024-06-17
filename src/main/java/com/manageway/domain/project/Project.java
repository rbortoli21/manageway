package com.manageway.domain.project;

import com.manageway.domain.PersistenceEntity;
import com.manageway.domain.customer.Customer;
import com.manageway.domain.employee.Employee;
import java.time.LocalDateTime;

public class Project extends PersistenceEntity {
    private String title;
    private LocalDateTime startDate;
    private LocalDateTime endDate;
    private Employee employee;
    private Customer customer;
    private Double totalPrice;

    @Override
    public void refreshReferences() {

    }

    public Project() {
    }

    public Project(String title, LocalDateTime startDate, LocalDateTime endDate, Employee employee, Customer customer, Double totalPrice) {
        this.title = title;
        this.startDate = startDate;
        this.endDate = endDate;
        this.employee = employee;
        this.customer = customer;
        this.totalPrice = totalPrice;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public LocalDateTime getStartDate() {
        return startDate;
    }

    public void setStartDate(LocalDateTime startDate) {
        this.startDate = startDate;
    }

    public LocalDateTime getEndDate() {
        return endDate;
    }

    public void setEndDate(LocalDateTime endDate) {
        this.endDate = endDate;
    }

    public Employee getEmployee() {
        return employee;
    }

    public void setEmployee(Employee employee) {
        this.employee = employee;
    }

    public Customer getCustomer() {
        return customer;
    }

    public void setCustomer(Customer customer) {
        this.customer = customer;
    }

    public Double getTotalPrice() {
        return totalPrice;
    }

    public void setTotalPrice(Double totalPrice) {
        this.totalPrice = totalPrice;
    }
}
