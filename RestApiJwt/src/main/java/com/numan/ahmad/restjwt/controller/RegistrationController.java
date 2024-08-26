package com.numan.ahmad.restjwt.controller;

import com.numan.ahmad.restjwt.model.Users;
import com.numan.ahmad.restjwt.service.RegistrationService;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class RegistrationController {

    private final RegistrationService service;

    public RegistrationController(RegistrationService service) {
        this.service = service;
    }

    @PostMapping("/register")
    public Users register(@RequestBody Users user) {
        return service.register(user);

    }
}
