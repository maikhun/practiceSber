package com.sbertech.credit_payment.controllers;

import com.sbertech.credit_payment.repos.CreditRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class ContractController {

    @GetMapping("/contracts")
    public String getPage(){
        return "contracts";
    }



}
