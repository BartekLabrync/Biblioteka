package com.example.biblioteka.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class MenuController {
    @GetMapping("/")
    public String mainMenu(){
        return "mainMenu";
    }
    @GetMapping("/nav.html")
    public String nav(){
        return "nav";
    }

    @GetMapping("/mainMenu")
    public String mainMenu2(){
        return "mainMenu";
    }

    @GetMapping("/myAccount")
    public String myAccount(){
        return "myAccount";
    }


    @GetMapping("/login")
    public String login(){
        return "login";
    }
}
