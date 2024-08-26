package com.numan.ahmad.restjwt.model;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

@Setter
@Getter
@Entity
public class Users {

    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "user_id_seq")
    @SequenceGenerator(name = "user_id_seq", sequenceName = "user_id_seq")
    private Long id;
    private String nameofuser;
    private String password;
    private String email;
    private String gender;
    private String status;

}
