package com.numan.ahmad.restjwt.repo;

import com.numan.ahmad.restjwt.model.UserPosts;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface UserPostsRepo extends JpaRepository<UserPosts, Integer> {


        //@Query("SELECT p FROM UserPosts p join p.users u where u.userId = :userId")
        //List<UserPosts> findAllPostsByUserId(@Param("userId") Long userId);
}
