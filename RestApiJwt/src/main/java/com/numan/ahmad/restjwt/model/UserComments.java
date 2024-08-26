package com.numan.ahmad.restjwt.model;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.RequiredArgsConstructor;
import lombok.Setter;

@Entity
@Table(name = "usercomments")
@Getter
@Setter
@RequiredArgsConstructor
public class UserComments {

    @Id
    private Long id;
    @SequenceGenerator(name = "user_id_seq", sequenceName = "user_id_seq")

    @ManyToOne
    @JoinColumn(name = "postid", referencedColumnName = "id")
    private UserPosts userPosts;
}
