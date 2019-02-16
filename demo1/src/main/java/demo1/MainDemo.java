package demo1;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class MainDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		ApplicationContext context = (ApplicationContext) 
				new ClassPathXmlApplicationContext("spring-config.xml");
		
		Greeter greet = (Greeter) context.getBean("greetId");
	
		greet.greet();
		
	}

}
