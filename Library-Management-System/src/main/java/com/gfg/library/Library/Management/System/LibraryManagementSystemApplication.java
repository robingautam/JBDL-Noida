package com.gfg.library.Library.Management.System;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import java.util.UUID;

@SpringBootApplication
public class LibraryManagementSystemApplication {

	public static void main(String[] args) {
		System.out.println("Time 1"+System.currentTimeMillis());
		System.out.println("Time 2"+System.currentTimeMillis());
		System.out.println("Time 3"+System.currentTimeMillis());
		SpringApplication.run(LibraryManagementSystemApplication.class, args);
	}

}
