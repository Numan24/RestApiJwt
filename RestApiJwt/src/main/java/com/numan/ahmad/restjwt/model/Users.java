package com.numan.ahmad.restjwt.model;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

import javax.validation.constraints.Email;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.Size;

@Setter
@Getter
@Entity
public class Users {

    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "user_id_seq")
    @SequenceGenerator(name = "user_id_seq", sequenceName = "user_id_seq")
    private Long id;

    @NotBlank(message = "user name can't be null/empty")
    @Size(min = 1, max = 20)
    private String nameofuser;

    @NotBlank(message = "password can't be null/empty")
    @Size(min = 1, max = 20)
    private String password;

    private String email;
    private String gender;
    private String status;

}
