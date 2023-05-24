package com.sbertech.credit_payment.services;


import com.sbertech.credit_payment.models.Contract;

import java.util.List;
import java.util.Optional;

public interface ContractService {

    List<Contract> findAllContracts();
    Optional<Contract> findContractById(Long id);
    Contract saveContract(Contract contract);
    Contract updateContract(Contract contract);
    void deleteContractById(Long id);




}
