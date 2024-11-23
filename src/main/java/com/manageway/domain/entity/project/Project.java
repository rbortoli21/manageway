package com.manageway.domain.entity.project;

import com.manageway.domain.entity.PersistenceEntity;
import com.manageway.domain.entity.customer.Customer;
import com.manageway.domain.entity.employee.Employee;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.FetchType;
import jakarta.persistence.ManyToOne;

import java.time.LocalDateTime;

@Entity
public class Project extends PersistenceEntity {

    @Column(name = "title", nullable = false)
    private String title;

    @Column(name = "start_date", nullable = false)
    private LocalDateTime startDate;
    private LocalDateTime endDate;

    @ManyToOne(fetch = FetchType.LAZY)
    private Employee employee;

    @ManyToOne(fetch = FetchType.LAZY)
    private Customer customer;

    @Column(name = "total_price", nullable = false)
    private Double totalPrice;

    Project() {
    }

    Project(ProjectBuilder builder) {
        this.title = builder.title;
        this.startDate = builder.startDate;
        this.endDate = builder.endDate;
        this.employee = builder.employee;
        this.customer = builder.customer;
        this.totalPrice = builder.totalPrice;
    }

    public static class ProjectBuilder {
        private String title;
        private LocalDateTime startDate;
        private LocalDateTime endDate;
        private Employee employee;
        private Customer customer;
        private Double totalPrice;

        public ProjectBuilder withTitle(String title) {
            this.title = title;
            return this;
        }

        public ProjectBuilder withStartDate(LocalDateTime startDate) {
            this.startDate = startDate;
            return this;
        }

        public ProjectBuilder withEndDate(LocalDateTime endDate) {
            this.endDate = endDate;
            return this;
        }

        public ProjectBuilder withEmployee(Employee employee) {
            this.employee = employee;
            return this;
        }

        public ProjectBuilder withCustomer(Customer customer) {
            this.customer = customer;
            return this;
        }

        public ProjectBuilder withTotalPrice(Double totalPrice) {
            this.totalPrice = totalPrice;
            return this;
        }

        public Project build() {
            return new Project(this);
        }
    }

    public String getTitle() {
        return title;
    }

    public LocalDateTime getStartDate() {
        return startDate;
    }

    public LocalDateTime getEndDate() {
        return endDate;
    }

    public Double getTotalPrice() {
        return totalPrice;
    }

    public Customer getCustomer() {
        return customer;
    }

    public Employee getEmployee() {
        return employee;
    }

    public void setCustomer(Customer customer) {
        this.customer = customer;
    }

    public void setEmployee(Employee employee) {
        this.employee = employee;
    }
}
