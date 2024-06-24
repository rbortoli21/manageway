/*
 * This file is generated by jOOQ.
 */
package com.manageway.generated.jooq.public_.tables.records;


import com.manageway.generated.jooq.public_.tables.Customer;

import java.time.LocalDateTime;
import java.util.UUID;

import org.jooq.Record1;
import org.jooq.impl.UpdatableRecordImpl;


/**
 * This class is generated by jOOQ.
 */
@SuppressWarnings({ "all", "unchecked", "rawtypes", "this-escape" })
public class CustomerRecord extends UpdatableRecordImpl<CustomerRecord> {

    private static final long serialVersionUID = 1L;

    /**
     * Setter for <code>public.customer.id</code>.
     */
    public void setId(UUID value) {
        set(0, value);
    }

    /**
     * Getter for <code>public.customer.id</code>.
     */
    public UUID getId() {
        return (UUID) get(0);
    }

    /**
     * Setter for <code>public.customer.name</code>.
     */
    public void setName(String value) {
        set(1, value);
    }

    /**
     * Getter for <code>public.customer.name</code>.
     */
    public String getName() {
        return (String) get(1);
    }

    /**
     * Setter for <code>public.customer.email</code>.
     */
    public void setEmail(String value) {
        set(2, value);
    }

    /**
     * Getter for <code>public.customer.email</code>.
     */
    public String getEmail() {
        return (String) get(2);
    }

    /**
     * Setter for <code>public.customer.phone</code>.
     */
    public void setPhone(String value) {
        set(3, value);
    }

    /**
     * Getter for <code>public.customer.phone</code>.
     */
    public String getPhone() {
        return (String) get(3);
    }

    /**
     * Setter for <code>public.customer.birth_date</code>.
     */
    public void setBirthDate(LocalDateTime value) {
        set(4, value);
    }

    /**
     * Getter for <code>public.customer.birth_date</code>.
     */
    public LocalDateTime getBirthDate() {
        return (LocalDateTime) get(4);
    }

    /**
     * Setter for <code>public.customer.address_id</code>.
     */
    public void setAddressId(UUID value) {
        set(5, value);
    }

    /**
     * Getter for <code>public.customer.address_id</code>.
     */
    public UUID getAddressId() {
        return (UUID) get(5);
    }

    /**
     * Setter for <code>public.customer.created_at</code>.
     */
    public void setCreatedAt(LocalDateTime value) {
        set(6, value);
    }

    /**
     * Getter for <code>public.customer.created_at</code>.
     */
    public LocalDateTime getCreatedAt() {
        return (LocalDateTime) get(6);
    }

    /**
     * Setter for <code>public.customer.updated_at</code>.
     */
    public void setUpdatedAt(LocalDateTime value) {
        set(7, value);
    }

    /**
     * Getter for <code>public.customer.updated_at</code>.
     */
    public LocalDateTime getUpdatedAt() {
        return (LocalDateTime) get(7);
    }

    /**
     * Setter for <code>public.customer.tenant_id</code>.
     */
    public void setTenantId(UUID value) {
        set(8, value);
    }

    /**
     * Getter for <code>public.customer.tenant_id</code>.
     */
    public UUID getTenantId() {
        return (UUID) get(8);
    }

    /**
     * Setter for <code>public.customer.username</code>.
     */
    public void setUsername(String value) {
        set(9, value);
    }

    /**
     * Getter for <code>public.customer.username</code>.
     */
    public String getUsername() {
        return (String) get(9);
    }

    /**
     * Setter for <code>public.customer.password</code>.
     */
    public void setPassword(String value) {
        set(10, value);
    }

    /**
     * Getter for <code>public.customer.password</code>.
     */
    public String getPassword() {
        return (String) get(10);
    }

    /**
     * Setter for <code>public.customer.role</code>.
     */
    public void setRole(String value) {
        set(11, value);
    }

    /**
     * Getter for <code>public.customer.role</code>.
     */
    public String getRole() {
        return (String) get(11);
    }

    // -------------------------------------------------------------------------
    // Primary key information
    // -------------------------------------------------------------------------

    @Override
    public Record1<UUID> key() {
        return (Record1) super.key();
    }

    // -------------------------------------------------------------------------
    // Constructors
    // -------------------------------------------------------------------------

    /**
     * Create a detached CustomerRecord
     */
    public CustomerRecord() {
        super(Customer.CUSTOMER);
    }

    /**
     * Create a detached, initialised CustomerRecord
     */
    public CustomerRecord(UUID id, String name, String email, String phone, LocalDateTime birthDate, UUID addressId, LocalDateTime createdAt, LocalDateTime updatedAt, UUID tenantId, String username, String password, String role) {
        super(Customer.CUSTOMER);

        setId(id);
        setName(name);
        setEmail(email);
        setPhone(phone);
        setBirthDate(birthDate);
        setAddressId(addressId);
        setCreatedAt(createdAt);
        setUpdatedAt(updatedAt);
        setTenantId(tenantId);
        setUsername(username);
        setPassword(password);
        setRole(role);
        resetChangedOnNotNull();
    }
}
