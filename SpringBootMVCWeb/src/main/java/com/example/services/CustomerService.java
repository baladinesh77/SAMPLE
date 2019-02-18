package com.example.services;

import java.util.List;

import com.example.models.Customer;

public interface CustomerService {
	List<Customer> findByName(String name);
	void save(Customer customer);
	Customer findByEmail(String email);
	void update(Customer customer);
}
