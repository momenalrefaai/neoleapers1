package com.neoleap.neoleapers.controller;

import com.neoleap.neoleapers.model.User;
import com.neoleap.neoleapers.services.UserService;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/api")
public class UserController {


    private UserService user;

    @GetMapping("/users")
    public List<User> getAllUsers (){

        return user.getAllUsers();
    }
}
