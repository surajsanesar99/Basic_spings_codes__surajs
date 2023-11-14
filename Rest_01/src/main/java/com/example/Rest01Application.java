package com.example;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.SpringBootConfiguration;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;

@SpringBootApplication
/*
 * @EnableAutoConfiguration
 * 
 * @ComponentScan
 * 
 * @SpringBootConfiguration
 */
public class Rest01Application {

	public static void main(String[] args) {
		SpringApplication.run(Rest01Application.class, args);
		System.out.println("suraj sanesar");
	}

}
