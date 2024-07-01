package com.manageway.domain.customer;

import com.manageway.domain.Id;
import com.manageway.domain.PersistenceEntity;
import com.manageway.domain.user.User;
import com.manageway.generated.jooq.public_.tables.records.CustomerRecord;

public class Customer extends PersistenceEntity {
    private User user;


    public Customer(User user) {
        this.user = user;
    }

    public Customer(Id id) {
        this.id = id;
    }

    public User getUser() {
        return user;
    }

    public void setUser(User user) {
        this.user = user;
    }

    @Override
    public CustomerRecord toRecord() {
        CustomerRecord record = new CustomerRecord();

        record.setId(id.value());
        record.setUserId(user.getId().value());
        record.setCreatedAt(createdAt);
        record.setUpdatedAt(updatedAt);
        record.setTenantId(tenantId.value());

        return record;
    }
}
