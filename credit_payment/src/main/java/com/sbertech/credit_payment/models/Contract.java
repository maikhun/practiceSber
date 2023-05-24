package com.sbertech.credit_payment.models;

import jakarta.persistence.*;

import java.util.Date;

@Entity
@Table(name="contract")
public class Contract {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long contractId;

    @Column(name="contractName")
    private String name;

    @Column(name="contractTerm")
    private String termOfContract;

    @Column(name="contractDateStart")
    private Date dateOfStart;

    @Column(name="contractStatus")
    private Boolean contractStatus;

    protected Contract() {}

    public Contract(String name, String termOfContract, Date dateOfStart) {
        this.name = name;
        this.termOfContract = termOfContract;
        this.dateOfStart = dateOfStart;
        this.contractStatus = true;
    }

    public Long getContractId() {
        return contractId;
    }

    public void setContractId(Long contractId) {
        this.contractId = contractId;
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

    public Boolean getContractStatus() {
        return contractStatus;
    }

    public void setContractStatus(Boolean contractStatus) {
        this.contractStatus = contractStatus;
    }
}
