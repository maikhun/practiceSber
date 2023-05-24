package com.sbertech.credit_payment.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class MainController {

    @GetMapping("/")
    public String getAuthorization(){
        return "authorization";
    }

    @GetMapping("/index")
    public String getMainPage(){
        return "index";
    }
}
