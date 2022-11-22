package com.tcs.www.beans.classes;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Controller {

	public static void main(String[] args) {
		
		
		ApplicationContext context = new ClassPathXmlApplicationContext("applicationConfig.xml");
	    Employee e = (Employee)context.getBean("employee");
	    System.out.println(e);
	    
	    
	}
}
