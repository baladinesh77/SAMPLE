package com.example.demo;

import java.util.Locale;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;
import org.springframework.web.servlet.View;
import org.springframework.web.servlet.ViewResolver;


@SpringBootApplication
public class BootDemo1Application {

	public static void main(String[] args) {
		System.out.println("welcome !!!!!!!!!!!!!!!!!");
		SpringApplication.run(BootDemo1Application.class, args);
	}

	@Bean
	public ViewResolver Resolver() {
		ViewResolver view = new ViewResolver() {
			
			@Override
			public View resolveViewName(String arg0, Locale arg1) throws Exception {
				// TODO Auto-generated method stub
				return null;
			}
		};
		return view;
		
	} 
}

