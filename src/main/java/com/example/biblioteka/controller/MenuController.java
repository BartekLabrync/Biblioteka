package com.example.biblioteka.controller;

import com.example.biblioteka.model.User;
import jakarta.servlet.http.HttpSession;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.SessionAttributes;

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

    @GetMapping(value = "/logout")
    public String logout(Model model, HttpSession session){

        session.invalidate();
        return "redirect:/";
    }

}
