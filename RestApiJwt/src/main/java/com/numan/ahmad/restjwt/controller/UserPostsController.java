package com.numan.ahmad.restjwt.controller;

import com.numan.ahmad.restjwt.model.DTOs.UserPostsDTO;
import com.numan.ahmad.restjwt.service.JWTService;
import com.numan.ahmad.restjwt.service.UserPostsService;
import jakarta.servlet.http.HttpServletRequest;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class UserPostsController {

    private final UserPostsService service;

    public UserPostsController(UserPostsService service, JWTService jwtService) {
        this.service = service;

    }


    @GetMapping("posts")
    public List<UserPostsDTO> findingAllPosts(HttpServletRequest request) {
        return service.allPosts();

    }

    /*@GetMapping("posts/{name}")
    public ResponseEntity findingUserPosts(HttpServletRequest request, @PathVariable String name) {
        return ResponseEntity.ok().body(service.findAllUserPost(request, name));

    }*/
}
