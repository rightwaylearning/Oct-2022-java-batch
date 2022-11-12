package com.fc.student.info;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Controller {

	public static void main(String[] args) {
		// IOC
		// 1] BeanFactory  2] ApplicationContext
		
		ApplicationContext context = new ClassPathXmlApplicationContext("application_config.xml");
	
		 Student s = (Student)context.getBean("student1");
		 
		 System.out.println(s);
	}
}
