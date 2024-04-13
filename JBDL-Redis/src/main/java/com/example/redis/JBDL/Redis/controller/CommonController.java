package com.example.redis.JBDL.Redis.controller;

import com.example.redis.JBDL.Redis.model.Person;
import com.example.redis.JBDL.Redis.util.RedisUtil;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
public class CommonController {

    @Autowired
    RedisUtil redisUtil;

    @GetMapping
    @RequestMapping("/get/data")
    public String getData(){
        return "Inside getData Method";
    }

    @PostMapping
    @RequestMapping("/create/person")
    public boolean createData(@RequestBody(required = false) Person person){
        redisUtil.
                setNonExpirableRedisKey(person.getId()+"",person);
        return true;
    }

    @PostMapping
    @RequestMapping("/create/person/exp")
    public boolean createDataExpirable(@RequestBody(required = false) Person person){
        redisUtil.
                setExpirableRedisData(person.getId()+"",person, "60");
        return true;
    }


    @GetMapping
    @RequestMapping("/get/person/{id}")
    public ResponseEntity<Object> createData(@PathVariable("id") String id){
      Person p = (Person) redisUtil.getNonExpirableKeyValue(id);
      if (p==null){
          return new ResponseEntity<>("Not Found", HttpStatus.NOT_FOUND);
      }
      return new ResponseEntity<>(p,HttpStatus.FOUND);
    }
}
