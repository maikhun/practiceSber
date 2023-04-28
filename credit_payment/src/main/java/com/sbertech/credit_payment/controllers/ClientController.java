package com.sbertech.credit_payment.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class ClientController {

    @GetMapping("/clients")
    public String getClients() {
        return "clients";
    }
}
