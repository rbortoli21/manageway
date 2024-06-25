package com.manageway.domain.user;

import com.manageway.domain.Id;
import com.manageway.domain.PersistenceEntity;
import com.manageway.domain.TenantId;
import com.manageway.domain.user.records.Email;
import com.manageway.domain.user.records.Name;
import com.manageway.domain.user.records.Password;
import com.manageway.domain.user.records.Phone;
import com.manageway.generated.jooq.public_.tables.records.UsersRecord;
import org.springframework.security.core.GrantedAuthority;
import org.springframework.security.core.authority.SimpleGrantedAuthority;
import org.springframework.security.core.userdetails.UserDetails;

import java.time.LocalDateTime;
import java.util.Collection;
import java.util.List;
import java.util.Optional;

public class User extends PersistenceEntity implements UserDetails {
    private Name name;
    private Email email;
    private Phone phone;
    private LocalDateTime birthDate;
    private Address address;
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


    public void setPassword(Password _password) {
        this.password = _password;
    }

    @Override
    public UsersRecord toRecord() {
        UsersRecord record = new UsersRecord();

        record.setId(id.value());
        record.setCreatedAt(createdAt);
        record.setUpdatedAt(updatedAt);
        record.setTenantId(Optional.ofNullable(tenantId).map(TenantId::value).orElse(null));
        record.setName(Optional.ofNullable(name).map(Name::value).orElse(null));
        record.setEmail(Optional.ofNullable(email).map(Email::value).orElse(null));
        record.setPhone(Optional.ofNullable(phone).map(Phone::value).orElse(null));
        record.setBirthDate(birthDate);
        record.setAddressId(Optional.ofNullable(address).map(Address::getId).map(Id::value).orElse(null));
        record.setPassword(Optional.ofNullable(password).map(Password::value).orElse(null));
        record.setRole(Optional.ofNullable(role).map(Role::name).orElse(null));

        return record;
    }

    @Override
    public Collection<? extends GrantedAuthority> getAuthorities() {
        return List.of(new SimpleGrantedAuthority(role.name()));
    }

    @Override
    public String getPassword() {
        return password.value();
    }

    @Override
    public String getUsername() {
        return email.value();
    }
}
