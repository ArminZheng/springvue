package com.az.controller;

import com.az.entities.User;
import com.az.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class UserController {
    @Autowired
    UserRepository userRepository;

    @GetMapping("user/{id}")
    public User getUser(@PathVariable("id") Integer id){
//        User user = userRepository.getOne(id);
        User user = userRepository.findById(id).get();
        return user;
    }

    @GetMapping("user")
    public User insertUser(User user){
        User save = userRepository.save(user);
        return save;
    }
}
