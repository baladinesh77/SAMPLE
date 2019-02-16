package com.example.demo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;

@Service
public class ProductService {
	//Setter Injection in Spring may or may not
	//use Setter method!!
	//@Autowired private ProductDAO dao;
	@Autowired 
	@Qualifier("dao1")
	private ProductDAO dao;
	
	public Product findById(int id) {
		System.out.println("ProductService findById()");
		return dao.findById(id);
	}
}
