package com.manageway.domain.entity.customer;

import com.manageway.domain.entity.PersistenceEntity;
import com.manageway.domain.entity.user.User;
import jakarta.persistence.Entity;
import jakarta.persistence.FetchType;
import jakarta.persistence.OneToOne;

@Entity
public class Customer extends PersistenceEntity {
    @OneToOne(fetch = FetchType.LAZY)
    private User user;

    Customer(CustomerBuilder builder) {
        this.user = builder.user;
        this.tenantId = user.getTenantId();
    }

    public static class CustomerBuilder {
        private User user;

        public CustomerBuilder withUser(User user) {
            this.user = user;
            return this;
        }

        public Customer build() {
            return new Customer(this);
        }
    }
}
