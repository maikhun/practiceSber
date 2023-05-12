package com.sbertech.credit_payment.controllers;


import com.sbertech.credit_payment.services.ContractService;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class ContractController {

    private final ContractService contractService;

    public ContractController(ContractService contractService) {
        this.contractService = contractService;
    }

    @GetMapping("/contracts")
    public String getPage(){
        return "contracts";
    }



}
