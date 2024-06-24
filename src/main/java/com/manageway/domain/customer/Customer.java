package com.manageway.domain.customer;

import com.manageway.domain.Id;
import com.manageway.domain.user.User;
import org.springframework.security.core.GrantedAuthority;
import org.springframework.security.core.authority.SimpleGrantedAuthority;

import java.util.Collection;
import java.util.List;

public class Customer extends User {

    public Customer(Id id) {
        this.id = id;
    }

    @Override
    public void refreshReferences() {

    }

    @Override
    public Collection<? extends GrantedAuthority> getAuthorities() {
        return List.of(new SimpleGrantedAuthority(super.getRole().name()));
    }

    @Override
    public String getUsername() {
        return super._getUsername().value();
    }

    @Override
    public String getPassword() {
        return super._getPassword().value();
    }
}
