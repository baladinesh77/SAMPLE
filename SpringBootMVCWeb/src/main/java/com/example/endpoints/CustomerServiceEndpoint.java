package com.example.endpoints;

import java.util.List;

import javax.jws.WebMethod;
import javax.jws.WebService;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.example.models.Customer;
import com.example.services.CustomerService;

@Component
@WebService(serviceName="customers")
public class CustomerServiceEndpoint {
	
	@Autowired
	private CustomerService service;
	
	@WebMethod(operationName="findByEmail")
	public Customer findByEmail(String email) {
		return service.findByEmail(email);
	}
	
	@WebMethod(operationName="findByName")
	public List<Customer> findByName(String name){
		return service.findByName(name);
	}
}
