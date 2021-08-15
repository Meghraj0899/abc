package com.lti.mypack;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;

@SpringBootApplication //This is the entry point to the application
@ComponentScan("com.lti.mypack")
public class SbProjectApplication {

	public static void main(String[] args) {
		System.out.println("Welcome to Spring Boot");
		SpringApplication.run(SbProjectApplication.class, args);
	}

}
