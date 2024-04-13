package com.example.security.SpringSecurity.config;

import com.example.security.SpringSecurity.model.User;
import com.example.security.SpringSecurity.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;

public class CustomUserDetailsService implements UserDetailsService {

    @Autowired
    UserRepository userRepository;
    @Override
    public UserDetails loadUserByUsername(String username) throws UsernameNotFoundException {
        User user = userRepository.findByEmail(username);
        if (user==null){
            throw new UsernameNotFoundException("user Not Found");
        }
        String roles = "true".equalsIgnoreCase(user.getIsAdmin())?"ADMIN":"NORMAL";
        UserDetails userDetails = org.springframework.security.core.userdetails.User.builder().
                username(user.getEmail()).password(user.getPassword()).roles(roles).build();
        return userDetails;
    }
}
