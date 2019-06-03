package com.codegym.controllers;

import org.springframework.stereotype.Controller;
import com.codegym.services.*;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping ("/validate")
public class controller {
    @GetMapping
    public String validApp() {
        return "index";
    }
    @PostMapping
    public String validApp(String email, Model model) {
        model.addAttribute("email",email);
        boolean isValidEmail;
        isValidEmail = EmailService.validate(email);
        if (isValidEmail){
            model.addAttribute("email", email);
            return "success";
        } else {
            return "error";
        }

    }
}
