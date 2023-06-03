package com.example.biblioteka.controller;

import com.example.biblioteka.model.User;
import com.example.biblioteka.model.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.ui.Model;

@Controller
public class UserController {

    @Autowired
    private UserRepository userRepository;


    @GetMapping("/users")
    public String users(Model model){
        Iterable<User> users = userRepository.findAll();
        model.addAttribute("users", users);

        return "users";
    }

    @PostMapping("/addNewUser")
    public String addNewUser(){
        //stworzyć formularz w addnewUser.html
        //napisać tworzenie użytkownika i dodawanie do bazy - tutaj
        User user = User.builder()
                .address("tutaj pobrać wartość z formularza")
                .build();
        //dodać wartości do user z formularza

        return "users";
    }
}
