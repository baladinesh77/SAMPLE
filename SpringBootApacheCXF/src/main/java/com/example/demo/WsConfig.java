package com.example.demo;

import javax.xml.ws.Endpoint;

import org.apache.cxf.Bus;
import org.apache.cxf.bus.spring.SpringBus;
import org.apache.cxf.jaxws.EndpointImpl;
import org.apache.cxf.transport.servlet.CXFServlet;
import org.springframework.boot.web.servlet.ServletRegistrationBean;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import com.example.services.GreetingService;


@Configuration
public class WsConfig {
	@Bean
	public ServletRegistrationBean<CXFServlet> dispatcherServlet() {
		return new ServletRegistrationBean<CXFServlet>(new CXFServlet(), "/services/*");
	}

	@Bean(name = Bus.DEFAULT_BUS_ID)
	public SpringBus springBus() {
		SpringBus springBus = new SpringBus();
		return springBus;
	}

	@Bean
	public Endpoint endpoint() {
		EndpointImpl endpoint = new EndpointImpl(springBus(), new GreetingService());

		endpoint.publish("/greetings");
		return endpoint;
	}
	
	//http://localhost:8080/services/greetings?wsdl 
}
