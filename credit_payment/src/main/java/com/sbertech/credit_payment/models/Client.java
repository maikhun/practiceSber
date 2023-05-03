package com.sbertech.credit_payment.models;

import jakarta.persistence.*;

import java.util.ArrayList;
import java.util.List;

@Entity
@Table(name = "client")
public class Client {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;

    @Column(name = "fullName")
    private String fullName;

    @Column(name="personalAccount")
    private ArrayList<String> personalAccounts;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getFullName() {
        return fullName;
    }

    public void setFullName(String fullName) {
        this.fullName = fullName;
    }

    public ArrayList<String> getPersonalAccounts() {
        return personalAccounts;
    }

    public void setPersonalAccounts(String[] personalAccounts) {
        this.personalAccounts = new ArrayList<>(List.of(personalAccounts));
    }
}
