package com.fc.college;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Controller {

	public static void main(String[] args) {
		
		ApplicationContext context = new ClassPathXmlApplicationContext("application_config.xml");
	    Student s = (Student)context.getBean("student1");
	    s.showData();
	
	}
}
