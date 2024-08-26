package com.numan.ahmad.restjwt.service;

import com.numan.ahmad.restjwt.model.Users;
import com.numan.ahmad.restjwt.model.UserPrincipal;
import com.numan.ahmad.restjwt.repo.UserRepo;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Service;

@Service
public class UserDetailService implements UserDetailsService {

    private final UserRepo userRepo;

    public UserDetailService(UserRepo userRepo) {
        this.userRepo = userRepo;
    }

    @Override
    public UserDetails loadUserByUsername(String nameOfUser) throws UsernameNotFoundException {
        Users user = userRepo.findByNameofuser(nameOfUser);
        if (user == null) {
            System.out.println("User Not Found");
            throw new UsernameNotFoundException("user not found");
        }

        return new UserPrincipal(user);
    }
}
