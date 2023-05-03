package com.sbertech.credit_payment.models;

import jakarta.persistence.*;

import java.util.Date;

@Entity
@Table(name="contract")
public class Contract {



    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)

    @Column(name="id_client")
    private Integer idClient;

    @Column(name="name")
    private String name;

    @Column(name="term")
    private String termOfContract;

    @Column(name="dateStart")
    private Date dateOfStart;

    public Integer getIdClient() {
        return idClient;
    }

    public void setIdClient(Integer idClient) {
        this.idClient = idClient;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getTermOfContract() {
        return termOfContract;
    }

    public void setTermOfContract(String termOfContract) {
        this.termOfContract = termOfContract;
    }

    public Date getDateOfStart() {
        return dateOfStart;
    }

    public void setDateOfStart(Date dateOfStart) {
        this.dateOfStart = dateOfStart;
    }

}
