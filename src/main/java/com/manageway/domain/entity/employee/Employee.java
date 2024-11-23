package com.manageway.domain.entity.employee;

import com.manageway.domain.entity.PersistenceEntity;
import com.manageway.domain.entity.user.User;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.FetchType;
import jakarta.persistence.OneToOne;

@Entity
public class Employee extends PersistenceEntity {
    @Column(name = "balance", nullable = false)
    private Double balance = 0.0;

    @OneToOne(fetch = FetchType.LAZY)
    private User user;

    Employee() {

    }

    Employee(EmployeeBuilder builder) {
        this.balance = builder.balance;
        this.user = builder.user;
        this.tenantId = user.getTenantId();
    }

    public static class EmployeeBuilder {
        private Double balance;
        private User user;

        public EmployeeBuilder withBalance(Double balance) {
            this.balance = balance;
            return this;
        }

        public EmployeeBuilder withUser(User user) {
            this.user = user;
            return this;
        }

        public Employee build() {
            return new Employee(this);
        }
    }

    public User getUser() {
        return user;
    }

    public Double getBalance() {
        return balance;
    }
}
