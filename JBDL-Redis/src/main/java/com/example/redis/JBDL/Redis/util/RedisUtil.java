package com.example.redis.JBDL.Redis.util;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.redis.core.RedisTemplate;
import org.springframework.stereotype.Component;

import java.util.concurrent.TimeUnit;

@Component
public class RedisUtil {

    @Autowired
    RedisTemplate<String, Object> redisTemplate;

    public void setNonExpirableRedisKey(String key, Object value){
        System.out.println("Inside setNonExpirableRedisKey Method");
        redisTemplate.opsForValue().set(key,value);
        System.out.println("Exiting setNonExpirableRedisKey Method");
    }

    public Object getNonExpirableKeyValue(String key){
        System.out.println("Inside getNonExpirableKeyValue Method");
        return redisTemplate.opsForValue().get(key);
    }

    public void setExpirableRedisData(String key, Object value, String time){
        System.out.println("Inside setExpirableRedisData Method");
        redisTemplate.opsForValue().set(key,value,60, TimeUnit.SECONDS);
        System.out.println("Exiting setExpirableRedisData Method");
    }
}
