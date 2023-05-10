package com.sbertech.credit_payment.controllers;

import com.sbertech.credit_payment.models.Client;
import com.sbertech.credit_payment.repos.ClientRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import java.util.ArrayList;
import java.util.Collection;

@Controller
public class ClientController {

    @Autowired
    private ClientRepo clientRepository;

    @GetMapping("/clients")
    public String getClients(Model model) {
        ArrayList<Client> clients = new ArrayList<>((Collection) clientRepository.findAll());
        model.addAttribute("clients", clients);
        return "clients";
    }
}
