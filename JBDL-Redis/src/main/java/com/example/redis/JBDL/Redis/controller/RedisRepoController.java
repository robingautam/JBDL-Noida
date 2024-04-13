package com.example.redis.JBDL.Redis.controller;

import com.example.redis.JBDL.Redis.model.Person;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/repository")
public class RedisRepoController {


    @PostMapping
    @RequestMapping(path = "/create/person")
    public boolean createPerson(@RequestBody(required = false) Person person){
    //    personRedisRepository.save(person);
        return true;
    }
}
