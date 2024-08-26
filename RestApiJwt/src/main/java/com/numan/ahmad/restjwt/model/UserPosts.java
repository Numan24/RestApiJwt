package com.numan.ahmad.restjwt.model;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.RequiredArgsConstructor;
import lombok.Setter;

@Entity
@Table(name = "userposts")
@Getter
@Setter
@RequiredArgsConstructor
public class UserPosts {

    @Id
    @SequenceGenerator(name = "user_id_seq", sequenceName = "user_id_seq")
    private Long id;

    @ManyToOne
    @JoinColumn(name = "userid", referencedColumnName = "id")
    private Users user;

    private String title;

    private String body;
}
