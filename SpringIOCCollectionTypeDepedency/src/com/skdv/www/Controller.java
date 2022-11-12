package com.skdv.www;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Controller {

	public static void main(String[] args) {
		
		ApplicationContext context = new ClassPathXmlApplicationContext("application_config.xml");
	    Student s = (Student)context.getBean("stud1");
	    
	    System.out.println(s);
	    
	    System.out.println(s.getMarks().getClass().getName());
	    System.out.println(s.getSet().getClass().getName());
	}
}
