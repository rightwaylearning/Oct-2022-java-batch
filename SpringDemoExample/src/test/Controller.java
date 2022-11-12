package test;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Controller {

	public static void main(String[] args) {
		
	    
	    ApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");
		Student s = (Student)context.getBean("id");
		System.out.println(s);
		
		
	}
}
