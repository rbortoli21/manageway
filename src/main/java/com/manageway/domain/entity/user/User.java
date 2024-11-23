package com.manageway.domain.entity.user;

import com.manageway.domain.entity.PersistenceEntity;
import com.manageway.domain.entity.user.records.Email;
import com.manageway.domain.entity.user.records.Name;
import com.manageway.domain.entity.user.records.Password;
import com.manageway.domain.entity.user.records.Phone;
import jakarta.persistence.*;

import java.time.LocalDateTime;

@Entity
public class User extends PersistenceEntity {
    @Embedded
    @AttributeOverride(name = "value", column = @Column(name = "name", nullable = false))
    private Name name;

    @Embedded
    @AttributeOverride(name = "value", column = @Column(name = "email", nullable = false))
    private Email email;

    @Embedded
    @AttributeOverride(name = "value", column = @Column(name = "phone"))
    private Phone phone;

    private LocalDateTime birthDate;

    @OneToOne(cascade = CascadeType.ALL, fetch = FetchType.LAZY)
    private Address address;

    @Embedded
    @AttributeOverride(name = "value", column = @Column(name = "password"))
    private Password password;

    @Enumerated(EnumType.STRING)
    @Column(name = "role", nullable = false)
    private Role role;

    User() {
    }

    User(UserBuilder builder) {
        this.name = new Name(builder.name);
        this.email = new Email(builder.email);
        this.phone = new Phone(builder.phone);
        this.birthDate = builder.birthDate;
        this.address = builder.address;
        this.password = new Password(builder.password);
        this.role = builder.role;
    }

    public static class UserBuilder {
        private String name;
        private String email;
        private String phone;
        private LocalDateTime birthDate;
        private Address address;
        private String password;
        private Role role;

        public UserBuilder withName(String name) {
            this.name = name;
            return this;
        }

        public UserBuilder withEmail(String email) {
            this.email = email;
            return this;
        }

        public UserBuilder withPhone(String phone) {
            this.phone = phone;
            return this;
        }

        public UserBuilder withBirthDate(LocalDateTime birthDate) {
            this.birthDate = birthDate;
            return this;
        }

        public UserBuilder withAddress(Address address) {
            this.address = address;
            return this;
        }

        public UserBuilder withPassword(String password) {
            this.password = password;
            return this;
        }

        public UserBuilder withRole(Role role) {
            this.role = role;
            return this;
        }

        public User build() {
            return new User(this);
        }
    }

    public Name getName() {
        return name;
    }

    public Email getEmail() {
        return email;
    }

    public Password getPassword() {
        return password;
    }

    public Role getRole() {
        return role;
    }
}
