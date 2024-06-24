package com.manageway.domain.user;

import com.manageway.domain.PersistenceEntity;
import com.manageway.domain.user.records.*;
import org.springframework.security.core.userdetails.UserDetails;

import java.time.LocalDateTime;

public abstract class User extends PersistenceEntity implements UserDetails {
    private Name name;
    private Email email;
    private Phone phone;
    private LocalDateTime birthDate;
    private Address address;

    private Username username;
    private Password password;

    private Role role;

    public Name getName() {
        return name;
    }

    public void setName(Name name) {
        this.name = name;
    }

    public Email getEmail() {
        return email;
    }

    public void setEmail(Email email) {
        this.email = email;
    }

    public Phone getPhone() {
        return phone;
    }

    public void setPhone(Phone phone) {
        this.phone = phone;
    }

    public LocalDateTime getBirthDate() {
        return birthDate;
    }

    public void setBirthDate(LocalDateTime birthDate) {
        this.birthDate = birthDate;
    }

    public Address getAddress() {
        return address;
    }

    public void setAddress(Address address) {
        this.address = address;
    }

    public Role getRole() {
        return role;
    }

    public void setRole(Role role) {
        this.role = role;
    }

    public Username _getUsername() {
        return username;
    }

    public void _setUsername(Username _username) {
        this.username = _username;
    }

    public Password _getPassword() {
        return password;
    }

    public void _setPassword(Password _password) {
        this.password = _password;
    }
}
