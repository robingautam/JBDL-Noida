package com.example.gfg.JBDLL11;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;

@SpringBootApplication
@ComponentScan(basePackages = {"com.example.gfg.controller", "com.example.gfg.JBDLL11","com.example.gfg"})
public class JbdlL11Application {

	public static void main(String[] args) {
		SpringApplication.run(JbdlL11Application.class, args);
	}

}
