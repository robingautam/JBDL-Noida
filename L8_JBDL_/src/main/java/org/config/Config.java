package org.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class Config {

    @Bean(name = {"rob","raj"})
    public Student getOrg(){
        return new Student("12");
    }
}
