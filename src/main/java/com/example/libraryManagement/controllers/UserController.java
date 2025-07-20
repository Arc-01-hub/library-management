package com.example.libraryManagement.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.libraryManagement.entitys.User;
import com.example.libraryManagement.services.UserService;

@CrossOrigin(origins = "http://127.0.0.1:5500")
@RestController
@RequestMapping("/users")
public class UserController {

    @Autowired
    private final UserService usersService;
    public UserController(UserService usersService){
        this.usersService=usersService;
    }
    
    @GetMapping
    public List<User> getAllUsers(){
        return usersService.getAllUsers();
    }

}
