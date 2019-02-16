package com.example.demo;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class ContactController {

	@GetMapping("/contactus") 
	public String getContact() {
		System.out.println("Contact US ");
		return "contactWelcome";
	}
	
	
}
