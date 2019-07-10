package com.tachyon.spring;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

/**
 * Created by umesh.pai on 01/16/2018.
 */

@SpringBootApplication
public class AWSApplication {
	
	public static void main(String[] args) {
		System.out.println("In Spring Boot");
		SpringApplication.run(AWSApplication.class, args);
	}
}
