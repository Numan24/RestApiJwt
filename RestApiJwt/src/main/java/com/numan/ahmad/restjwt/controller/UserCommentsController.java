package com.numan.ahmad.restjwt.controller;

import com.numan.ahmad.restjwt.model.DTOs.UserCommentsDTO;
import com.numan.ahmad.restjwt.model.Users;
import com.numan.ahmad.restjwt.service.UserCommentsService;
import jakarta.servlet.http.HttpServletRequest;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class UserCommentsController {

    private final UserCommentsService service;

    public UserCommentsController(UserCommentsService service) {
        this.service = service;
    }


    @GetMapping("comments")
    public List<UserCommentsDTO> findingAllComments(HttpServletRequest request) {
        return service.allComments();

    }

    @GetMapping("comments/{user}")
    public List<Users> findingUserComments(@PathVariable Users user) {
        //return service.allUsers();
        return null;

    }
}
