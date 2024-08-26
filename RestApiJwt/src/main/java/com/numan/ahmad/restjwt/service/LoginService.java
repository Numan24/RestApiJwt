package com.numan.ahmad.restjwt.service;

import com.numan.ahmad.restjwt.model.Users;
import org.springframework.security.authentication.AuthenticationManager;
import org.springframework.security.authentication.UsernamePasswordAuthenticationToken;
import org.springframework.security.core.Authentication;
import org.springframework.stereotype.Service;

@Service
public class LoginService {

    private final JWTService jwtService;

    private final AuthenticationManager authManager;

    public LoginService(JWTService jwtService, AuthenticationManager authManager) {
        this.jwtService = jwtService;
        this.authManager = authManager;
    }

    public String verify(Users user) {
        Authentication authentication = authManager.authenticate(new UsernamePasswordAuthenticationToken(user.getNameofuser(), user.getPassword()));
        if (authentication.isAuthenticated()) {
            return jwtService.generateToken(user.getNameofuser());
        } else {
            return "fail";
        }
    }
}
