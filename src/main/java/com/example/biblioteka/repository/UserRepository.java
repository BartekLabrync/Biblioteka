package com.example.biblioteka.repository;

import com.example.biblioteka.model.User;
import org.springframework.data.repository.CrudRepository;

public interface UserRepository extends CrudRepository<User, Long> {

}
