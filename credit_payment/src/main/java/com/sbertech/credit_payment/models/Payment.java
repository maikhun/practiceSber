package com.sbertech.credit_payment.models;

import jakarta.persistence.*;

import java.math.BigDecimal;
import java.util.Date;

@Entity
@Table(name="payment")
public class Payment {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;

    @Column(name = "id_credit")
    private Integer idCredit;

    @Column(name = "date")
    private Date dateOfPayment;

    @Column(name = "amount")
    private BigDecimal amountOfPayment;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Integer getIdCredit() {
        return idCredit;
    }

    public void setIdCredit(Integer idCredit) {
        this.idCredit = idCredit;
    }

    public Date getDateOfPayment() {
        return dateOfPayment;
    }

    public void setDateOfPayment(Date dateOfPayment) {
        this.dateOfPayment = dateOfPayment;
    }

    public BigDecimal getAmountOfPayment() {
        return amountOfPayment;
    }

    public void setAmountOfPayment(BigDecimal amountOfPayment) {
        this.amountOfPayment = amountOfPayment;
    }
}
