package com.example.oauth.JBDLOAuth.configuration;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.security.config.Customizer;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;
import org.springframework.security.web.SecurityFilterChain;

@Configuration
@EnableWebSecurity
public class SecurityConfig {

    @Bean
    public SecurityFilterChain securityFilterChain(HttpSecurity httpSecurity) throws Exception {
       return httpSecurity.oauth2Login(oauth -> {
            oauth.loginPage("/login.html");
            oauth.defaultSuccessUrl("/get/data");

        }).authorizeHttpRequests(auth->{
            auth.requestMatchers("/login.html/**").permitAll();
            auth.anyRequest().authenticated();
               })
               .oauth2Login(Customizer.withDefaults()).build();
    }
}
