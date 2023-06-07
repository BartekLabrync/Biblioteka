package com.example.biblioteka.controller;

import com.example.biblioteka.model.User;
import com.example.biblioteka.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
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

//
//
//    @GetMapping("/create")
//    public String createQuizForm(Model model){
//        model.addAttribute("quizViewModel", new QuizViewModel());
//        model.addAttribute("categories", quizService.findAllCategories());
//        return "/quiz/create";
//    }
//
//    @PostMapping("/create")
//    public String createQuiz(
//            @Valid QuizViewModel quizViewModel,
//            BindingResult errors,
//            Model model){
//        if (errors.hasErrors()){
//            model.addAttribute("categories", quizService.findAllCategories());
//            return "/quiz/create";
//        }
//        final Quiz quiz = QuizMapper.mapToQuiz(quizViewModel);
//        quizService.saveQuiz(quiz);
//        model.addAttribute("quizzes", quizService.findAllQuizzes());
//        return "/quiz/index";
//    }
}
