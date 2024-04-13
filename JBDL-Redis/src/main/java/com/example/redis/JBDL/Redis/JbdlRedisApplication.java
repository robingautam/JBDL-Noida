package com.example.redis.JBDL.Redis;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cache.annotation.EnableCaching;

@SpringBootApplication
@EnableCaching
public class JbdlRedisApplication {

	public static void main(String[] args) {
		SpringApplication.run(JbdlRedisApplication.class, args);
	}

}
