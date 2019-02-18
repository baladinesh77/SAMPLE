package com.example.controllers;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class MainController {
	
	@GetMapping("/")
	public String showHome() {
		System.out.println("Hello main sreenadh awf asdfs");
		return "home";
	}
}