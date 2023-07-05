package com.example.biblioteka.service;

import com.example.biblioteka.dto.UserDTO;
import com.example.biblioteka.model.User;
import com.example.biblioteka.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Service
public class UserService {

    @Autowired
    private UserRepository userRepository;
    public Optional<User> loginUser(UserDTO userDTO){
        Iterable<User> allUsers = userRepository.findAll();

        for(User user: allUsers){
            if(user.getLogin().equals(userDTO.getInputLogin()) &&
            user.getPassword().equals(userDTO.getInputPassword())){
                return Optional.of(user);
            }
        }



        return Optional.empty();
    }
}
