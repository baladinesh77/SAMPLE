package com.example.demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.PropertySource;

@SpringBootApplication
@PropertySource("db.properties")
public class SpringBootReadDbApplication {

	public static void main(String[] args) {
		SpringApplication.run(SpringBootReadDbApplication.class, args);
	}

}

