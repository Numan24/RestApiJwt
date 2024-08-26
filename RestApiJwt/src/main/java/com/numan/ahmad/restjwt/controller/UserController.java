package com.numan.ahmad.restjwt.controller;

import com.numan.ahmad.restjwt.service.UserService;
import jakarta.servlet.http.HttpServletRequest;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class UserController {

    private final UserService service;

    public UserController(UserService service) {
        this.service = service;
    }


    @GetMapping("users")
    public String greet(HttpServletRequest request) {
        return "Welcome " + request.getSession().getId();

    }

}
