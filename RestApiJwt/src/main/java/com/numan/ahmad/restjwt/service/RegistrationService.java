package com.numan.ahmad.restjwt.service;

import com.numan.ahmad.restjwt.model.Users;
import com.numan.ahmad.restjwt.repo.UserRepo;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.stereotype.Service;

@Service
public class RegistrationService {

    private final UserRepo repo;
    private final BCryptPasswordEncoder encoder;

    public RegistrationService(UserRepo repo) {
        this.repo = repo;
        this.encoder = new BCryptPasswordEncoder(12);
    }


    public Users register(Users user) {
        user.setPassword(encoder.encode(user.getPassword()));
        repo.save(user);
        return user;
    }
}
