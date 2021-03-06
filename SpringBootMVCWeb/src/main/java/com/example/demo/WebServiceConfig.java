package com.example.demo;

import org.springframework.boot.web.servlet.ServletRegistrationBean;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.core.io.ClassPathResource;
import org.springframework.remoting.jaxws.SimpleHttpServerJaxWsServiceExporter;
import org.springframework.remoting.jaxws.SimpleJaxWsServiceExporter;
import org.springframework.ws.config.annotation.EnableWs;
import org.springframework.ws.config.annotation.WsConfigurerAdapter;
import org.springframework.ws.transport.http.MessageDispatcherServlet;
import org.springframework.ws.wsdl.wsdl11.SimpleWsdl11Definition;

@EnableWs
@Configuration

public class WebServiceConfig extends WsConfigurerAdapter {
//	@Bean
//	public ServletRegistrationBean messageDispatcherServlet(ApplicationContext applicationContext) {
//		MessageDispatcherServlet servlet = new MessageDispatcherServlet();
//		servlet.setApplicationContext(applicationContext);
//		servlet.setTransformWsdlLocations(true);
//		return new ServletRegistrationBean(servlet, "/ws/*");
//	}
//
//	@Bean("customer")
//	public SimpleWsdl11Definition wsdl() {
//		SimpleWsdl11Definition wsdl = new SimpleWsdl11Definition();
//		wsdl.setWsdl(new ClassPathResource("wsdl/CustomerServiceEndpoint.wsdl"));
//		return wsdl;
//	}
	@Bean
	public SimpleJaxWsServiceExporter exporter() {
		SimpleJaxWsServiceExporter exp = new SimpleJaxWsServiceExporter();
		exp.setBaseAddress("http://localhost:8081/ws");
		return exp;
	}
}
