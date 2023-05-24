package com.sbertech.credit_payment.controllers;

import com.sbertech.credit_payment.services.ClientService;
import org.springframework.stereotype.Controller;

import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class ClientController {

    public final ClientService clientService;

    public ClientController(ClientService clientService) {
        this.clientService = clientService;
    }

    @GetMapping("/clients")
    public String getClientsPage() {
        return "clients";
    }

}
