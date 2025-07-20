package com.example.libraryManagement.services;

import java.util.List;

import org.springframework.stereotype.Service;

import com.example.libraryManagement.entitys.User;
import com.example.libraryManagement.repositorys.UserRepository;

@Service
public class UserService {
    
    private final UserRepository userRepository;

    public UserService(UserRepository userRepository){
        this.userRepository = userRepository;
    }

    //SHOW ALL USERS
    public List<User> getAllUsers(){
        return userRepository.findAll();
    }
}
