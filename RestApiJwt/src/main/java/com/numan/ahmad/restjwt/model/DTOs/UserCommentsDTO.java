package com.numan.ahmad.restjwt.model.DTOs;

import lombok.Builder;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@Builder
public class UserCommentsDTO {

    private Long id;
    private Long postId;
    private String name;
    private String email;
    private String body;
}
