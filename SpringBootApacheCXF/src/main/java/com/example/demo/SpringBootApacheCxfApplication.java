package com.example.demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;

@SpringBootApplication
@ComponentScan("com.example")
public class SpringBootApacheCxfApplication {

	public static void main(String[] args) {
		SpringApplication.run(SpringBootApacheCxfApplication.class, args);
	}

}
