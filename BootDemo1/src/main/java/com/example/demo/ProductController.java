package com.example.demo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class ProductController {
	
	@Autowired 
	private ProductService service;
	
	
	
	@GetMapping("/product")
	public Product find(@RequestParam("id")int id) {
		System.out.println("ProductController find()");
		return service.findById(id);
	}

}
