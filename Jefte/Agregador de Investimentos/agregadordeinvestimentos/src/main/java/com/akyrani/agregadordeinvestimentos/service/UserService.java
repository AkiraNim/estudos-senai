package com.akyrani.agregadordeinvestimentos.service;

import com.akyrani.agregadordeinvestimentos.controller.CreateUserDto;
import com.akyrani.agregadordeinvestimentos.repository.UserRepository;
import org.springframework.stereotype.Service;

@Service
public class UserService {

    private UserRepository userRepository;

    public UserService(UserRepository userRepository) {
        this.userRepository = userRepository;
    }

    public void createUser(CreateUserDto createUserDto){

    }
}
