package com.numan.ahmad.restjwt.model.DTOs;

import lombok.Builder;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@Builder
public class UserPostsDTO {

    private Long id;
    private Long userId;
    private String title;
    private String body;
}
