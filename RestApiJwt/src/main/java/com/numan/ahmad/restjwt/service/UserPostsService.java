package com.numan.ahmad.restjwt.service;

import com.numan.ahmad.restjwt.model.DTOs.UserPostsDTO;
import com.numan.ahmad.restjwt.model.UserPosts;
import com.numan.ahmad.restjwt.model.Users;
import com.numan.ahmad.restjwt.repo.UserPostsRepo;
import com.numan.ahmad.restjwt.repo.UserRepo;
import jakarta.servlet.http.HttpServletRequest;
import org.springframework.context.ApplicationContext;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class UserPostsService {

    private final UserPostsRepo userPostsRepo;
    private final ApplicationContext context;
    private final JWTService jwtService;
    private final UserRepo userRepo;

    public UserPostsService(UserPostsRepo userPostsRepo, UserRepo userRepo, JWTService jwtService,
                            ApplicationContext context) {
        this.userPostsRepo = userPostsRepo;
        this.jwtService = jwtService;
        this.context = context;
        this.userRepo = userRepo;

    }

    public List<UserPostsDTO> allPosts() {
        List<UserPosts> usersPosts = userPostsRepo.findAll();
        List<UserPostsDTO> userPostsDTOList = new ArrayList<>();

        for(UserPosts up : usersPosts) {
            userPostsDTOList.add(UserPostsDTO.builder()
                    .id(up.getId())
                    .userId(up.getUser().getId())
                    .title(up.getTitle())
                    .body(up.getBody())
                    .build());
        }
        return userPostsDTOList;
    }

    public List<UserPosts> findAllUserPost (HttpServletRequest request, String name) {

        String authHeader = request.getHeader("Authorization");
        String token = null;
        String username = null;

        if (authHeader != null && authHeader.startsWith("Bearer ")) {
            token = authHeader.substring(7);
            username = jwtService.extractUserName(token);
        }

        UserDetails userDetails = context.getBean(UserDetailService.class).loadUserByUsername(name);
        if (jwtService.validateToken(token, userDetails)) {
            Users user = userRepo.findByNameofuser(userDetails.getUsername());
            //return userPostsRepo.findAllPostsByUserId(user.getId());
        }
        return new ArrayList<>();
    }
}
