package com.sbertech.credit_payment.repos;

import com.sbertech.credit_payment.models.Payment;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface PaymentRepo extends CrudRepository<Payment, Long> {
}
