package com.numan.ahmad.restjwt.controller;

import com.numan.ahmad.restjwt.model.Users;
import com.numan.ahmad.restjwt.service.LoginService;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class LoginController {

    private final LoginService service;

    public LoginController(LoginService service) {
        this.service = service;
    }


    @PostMapping("/login")
    public String login(@RequestBody @Validated Users user) {
        return service.verify(user);

    }
}
