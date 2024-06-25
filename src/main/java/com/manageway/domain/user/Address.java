package com.manageway.domain.user;


import com.manageway.domain.PersistenceEntity;
import com.manageway.generated.jooq.public_.tables.records.AddressRecord;

public class Address extends PersistenceEntity {
    private String street;
    private String city;
    private String state;
    private String zipCode;

    public Address() {
    }

    public Address(String street, String city, String state, String zipCode) {
        this.street = street;
        this.city = city;
        this.state = state;
        this.zipCode = zipCode;
    }

    public String getStreet() {
        return street;
    }

    public void setStreet(String street) {
        this.street = street;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public String getState() {
        return state;
    }

    public void setState(String state) {
        this.state = state;
    }

    public String getZipCode() {
        return zipCode;
    }

    public void setZipCode(String zipCode) {
        this.zipCode = zipCode;
    }

    @Override
    public AddressRecord toRecord() {
        AddressRecord record = new AddressRecord();
        record.setId(id.value());
        record.setStreet(street);
        record.setCity(city);
        record.setState(state);
        record.setZipCode(zipCode);
        record.setCreatedAt(createdAt);
        record.setUpdatedAt(updatedAt);
        record.setTenantId(tenantId.value());

        return record;
    }
}
