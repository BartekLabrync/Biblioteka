package com.example.biblioteka.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class MenuController {
    @GetMapping("/")
    public String mainMenu(){
        return "mainMenu";
    }

    @GetMapping("/books")
    public String books(){
        return "books";
    }

    @GetMapping("/myAccount")
    public String myAccount(){
        return "myAccount";
    }

    @GetMapping("/addNewUser")
    public String addNewUser(){
        return "addNewUser";
    }

    @GetMapping("/login")
    public String login(){
        return "login";
    }
}
