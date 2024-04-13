package com.example.security.SpringSecurity.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.security.config.Customizer;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;
import org.springframework.security.core.userdetails.User;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.security.provisioning.InMemoryUserDetailsManager;
import org.springframework.security.web.SecurityFilterChain;

@Configuration
@EnableWebSecurity
public class SecurityConfig {

   /* @Bean
    public UserDetailsService userDetailsService(){
        UserDetails admin = User.builder().username("admin").password(passwordEncoder().encode("admin123")).roles("ADMIN").build();
        UserDetails normal = User.builder().username("robin").password(passwordEncoder().encode("1234")).roles("NORMAL").build();
        return new InMemoryUserDetailsManager(admin,normal);
    }*/

    @Bean
    public UserDetailsService userDetailsService(){
        return new CustomUserDetailsService();
    }



    @Bean
    public SecurityFilterChain securityFilterChain(HttpSecurity httpSecurity) throws Exception {

       return httpSecurity.
               csrf(csrf->{
                   csrf.disable();
               }).
                authorizeHttpRequests(auth->{
                    auth.requestMatchers("/security/public/**").permitAll();
                    auth.requestMatchers("/security/normal/**").hasRole("NORMAL");
                    auth.requestMatchers("/security/admin/**").hasRole("ADMIN");
                    auth.anyRequest().permitAll();
                }).formLogin(Customizer.withDefaults()).build();
    }

    @Bean
    public PasswordEncoder passwordEncoder(){
        return new BCryptPasswordEncoder();
    }
}
