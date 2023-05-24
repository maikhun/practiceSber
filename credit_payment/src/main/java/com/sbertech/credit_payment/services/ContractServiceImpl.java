package com.sbertech.credit_payment.services;

import com.sbertech.credit_payment.models.Contract;
import com.sbertech.credit_payment.repos.ContractRepo;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class ContractServiceImpl implements ContractService {

    public final ContractRepo contractRepository;

    public ContractServiceImpl(ContractRepo contractRepository) {
        this.contractRepository = contractRepository;
    }

    @Override
    public List<Contract> findAllContracts() {
        return (List<Contract>) contractRepository.findAll();
    }

    @Override
    public Optional<Contract> findContractById(Long id) {
        return contractRepository.findById(id);
    }

    @Override
    public Contract saveContract(Contract contract) {
        return contractRepository.save(contract);
    }

    @Override
    public Contract updateContract(Contract contract) {
        return contractRepository.save(contract);
    }

    @Override
    public void deleteContractById(Long id) {
        contractRepository.deleteById(id);
    }
}
