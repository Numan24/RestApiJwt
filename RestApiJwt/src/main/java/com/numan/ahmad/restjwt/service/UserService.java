package com.numan.ahmad.restjwt.service;

import com.numan.ahmad.restjwt.model.Users;
import com.numan.ahmad.restjwt.repo.UserRepo;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class UserService {

    private final UserRepo userRepo;

    public UserService(UserRepo userRepo) {
        this.userRepo = userRepo;
    }

    public List<Users> allUsers() {
        return userRepo.findAll();
    }
}
