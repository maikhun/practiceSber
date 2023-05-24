package com.sbertech.credit_payment.repos;

import com.sbertech.credit_payment.models.Contract;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ContractRepo extends CrudRepository<Contract, Long> {
}
