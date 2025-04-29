package com.akyrani.security.controllers;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("api/user")
public class UserController {
    @RequestMapping("")
    public String user() {
        return "Hello User";
    }
}
