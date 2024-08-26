package com.numan.ahmad.restjwt.service;

import com.numan.ahmad.restjwt.model.DTOs.UserCommentsDTO;
import com.numan.ahmad.restjwt.model.UserComments;
import com.numan.ahmad.restjwt.repo.UserCommentsRepo;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class UserCommentsService {

    private final UserCommentsRepo userCommentsRepo;

    public UserCommentsService(UserCommentsRepo userCommentsRepo) {
        this.userCommentsRepo = userCommentsRepo;
    }

    public List<UserCommentsDTO> allComments() {
        List<UserComments> comments = userCommentsRepo.findAll();

        List<UserCommentsDTO> userCommentsDTOList = new ArrayList<>();

        for(UserComments uc : comments) {
            userCommentsDTOList.add(UserCommentsDTO.builder()
                    .id(uc.getId())
                            .body(uc.getUserPosts().getBody())
                            .postId(uc.getUserPosts().getId())
                            .name(uc.getUserPosts().getUser().getNameofuser())
                            .body(uc.getUserPosts().getBody())
                    .build());
        }
        return userCommentsDTOList;

    }
}
