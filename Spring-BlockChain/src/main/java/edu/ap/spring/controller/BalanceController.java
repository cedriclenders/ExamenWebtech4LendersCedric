package edu.ap.spring.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

import edu.ap.spring.service.Wallet;

@Controller
class BalanceController {

    @GetMapping("/balance/")
    public Float Balance(Wallet a) {
        return a.getBalance();
    }

}