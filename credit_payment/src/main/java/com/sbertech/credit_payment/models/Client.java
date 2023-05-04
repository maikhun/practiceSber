package com.sbertech.credit_payment.models;

import jakarta.persistence.*;

import java.util.List;
import java.util.Set;


@Entity
@Table(name = "client")
public class Client {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(name = "fullName")
    private String fullName;

    @Column(name = "personalAccount")
    private Set<String> personalAccount;

    protected Client() {}

    public Client(String fullName, String[] personalAccount) {
        this.fullName = fullName;
        this.personalAccount = Set.of(personalAccount);
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getFullName() {
        return fullName;
    }

    public void setFullName(String fullName) {
        this.fullName = fullName;
    }

    public Set<String> getPersonalAccount() {
        return personalAccount;
    }

    public void setPersonalAccount(Set<String> personalAccount) {
        this.personalAccount = personalAccount;
    }
}
