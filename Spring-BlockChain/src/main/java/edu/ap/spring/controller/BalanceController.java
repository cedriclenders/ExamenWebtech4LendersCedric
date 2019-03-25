package edu.ap.spring.controller;

import org.springframework.stereotype.Controller;

@Controller
class BalanceController {

    @GetMapping("/balance/")
    public String getBalance(@Pathvariable("balance") String Balance, Model model){

        Wallet a = 
    }

}