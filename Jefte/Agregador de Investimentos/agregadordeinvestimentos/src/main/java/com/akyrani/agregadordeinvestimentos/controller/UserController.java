package com.akyrani.agregadordeinvestimentos.controller;

import com.akyrani.agregadordeinvestimentos.entity.User;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.UUID;


@RestController
@RequestMapping("/v1/users")
public class UserController {

    @PostMapping
    public ResponseEntity<User> createUser(@RequestBody CreateUserDto createUserDto){
        return null;
    }

    @GetMapping("/{userId}")
    public ResponseEntity<User> getUserById (@PathVariable ("userId") String userId){
        return null;
    }
}
