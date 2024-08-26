package com.numan.ahmad.restjwt.repo;

import com.numan.ahmad.restjwt.model.UserComments;
import com.numan.ahmad.restjwt.model.UserPosts;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface UserCommentsRepo extends JpaRepository<UserComments, Integer> {


       // List<UserPosts> FindAllUserPostsByUsers(String nameofuser);
}
