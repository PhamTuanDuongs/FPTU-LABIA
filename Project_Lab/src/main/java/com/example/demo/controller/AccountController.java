/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.example.demo.controller;

import com.example.demo.model.Account;
import com.example.demo.repository.AccountRepository;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

/**
 *
 * @author admin1
 */
@Controller
public class AccountController {

    @Autowired
    AccountRepository accountRepository;

    @RequestMapping(path = "/login", method = RequestMethod.GET)
    public String showLoginForm(ModelMap modelMap) {
        return "authorization/login";
    }

    @RequestMapping(path = "/logins", method = RequestMethod.GET)
    public String hello(ModelMap modelMap) {
        List<Account> account = accountRepository.findAll();
        modelMap.addAttribute("list", account);
        return ("jsp/home");
    }
}
