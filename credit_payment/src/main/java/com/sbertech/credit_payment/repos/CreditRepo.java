package com.sbertech.credit_payment.repos;


import com.sbertech.credit_payment.models.Credit;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface CreditRepo extends CrudRepository<Credit, Long> {

}
