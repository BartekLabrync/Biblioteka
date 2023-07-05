package com.example.biblioteka.controller;

import com.example.biblioteka.dto.UserDTO;
import com.example.biblioteka.model.User;
import com.example.biblioteka.repository.UserRepository;
import com.example.biblioteka.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

@Controller
@SessionAttributes("loggedUser")
public class UserController {

    @Autowired
    private UserRepository userRepository;

    private final UserService userService;

    @Autowired
    public UserController(UserService userService) {
        this.userService = userService;
    }

    @GetMapping("/users")
    public String users(Model model){
        Iterable<User> users = userRepository.findAll();
        model.addAttribute("users", users);
        return "users";
    }

    @PostMapping("/addNewUser")
    public String addNewUser(
            User newUser,
            Model model){
        userRepository.save(newUser);

        return "redirect:users";
    }

    @GetMapping("/addNewUser")
    public String addNewUserView(Model model){

        model.addAttribute("newUser", new User());
        return "addNewUser";
    }

    @GetMapping("/login")
    public String login(Model model){
        if(model.containsAttribute("loggedUser")){
            return "redirect:myAccount";
        }

        model.addAttribute("user", new UserDTO());
        return "login";
    }

    @PostMapping(value = "/login")
    public String postLogin(Model model, @ModelAttribute("user") UserDTO user){
        if(userService.loginUser(user).isPresent()){
            model.addAttribute("loggedUser", userService.loginUser(user).get());
            return "redirect:myAccount";
        }
        return "login";
    }

    @GetMapping("/myAccount")
    public String myAccount(Model model, @SessionAttribute("loggedUser") User user){

        model.addAttribute("user", user);
        return "myAccount";
    }



}
