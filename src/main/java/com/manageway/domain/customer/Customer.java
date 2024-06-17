package com.manageway.domain.customer;

import com.manageway.domain.Id;
import com.manageway.domain.person.Person;

public class Customer extends Person {

    @Override
    public void refreshReferences() {

    }

    public Customer(Id id) {
        this.id = id;
    }
}
