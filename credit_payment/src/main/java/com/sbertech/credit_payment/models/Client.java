package com.sbertech.credit_payment.models;

import jakarta.persistence.*;

import java.util.List;
import java.util.Set;


@Entity
@Table(name = "client")
public class Client {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long clientId;

    @Column(name = "clientName")
    private String clientName;

    @Column(name = "clientPersonalAccount")
    private String personalAccount;

    @Column(name = "clientStatus")
    private boolean clientStatus;

    @Column(name = "clientPassword")
    private String password;

    protected Client() {
    }

    public Client(String clientName, String personalAccount, String password) {
        this.clientName = clientName;
        this.personalAccount = personalAccount;
        this.clientStatus = true;
        this.password = password;
    }

    public Long getClientId() {
        return clientId;
    }

    public void setClientId(Long clientId) {
        this.clientId = clientId;
    }

    public String getClientName() {
        return clientName;
    }

    public void setClientName(String clientName) {
        this.clientName = clientName;
    }

    public String getPersonalAccount() {
        return personalAccount;
    }

    public void setPersonalAccount(String personalAccount) {
        this.personalAccount = personalAccount;
    }

    public boolean isClientStatus() {
        return clientStatus;
    }

    public void setClientStatus(boolean clientStatus) {
        this.clientStatus = clientStatus;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }
}
