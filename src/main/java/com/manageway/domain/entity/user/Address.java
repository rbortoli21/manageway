package com.manageway.domain.entity.user;


import com.manageway.domain.entity.PersistenceEntity;
import jakarta.persistence.Entity;

@Entity
public class Address extends PersistenceEntity {
    private String street;
    private String city;
    private String state;
    private String zipCode;

    Address() {
    }
}
