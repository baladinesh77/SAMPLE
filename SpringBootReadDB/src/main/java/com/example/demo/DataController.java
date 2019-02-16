package com.example.demo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;


@RestController
public class DataController {

	@Autowired 
	private DataConnection conn;
	
	@GetMapping("/getdbprops")
	private String process(@RequestParam("name")String name) {
		
		switch(name) {
		case "db":  
			return conn.getDbName();
		case "url":
			return conn.getUrl();
		case "user":
			return conn.getUsername();
		case "pwd":
			return conn.getPassword();
		
		}
		return "default";
		
	}
}
