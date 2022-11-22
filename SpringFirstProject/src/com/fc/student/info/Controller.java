package com.fc.student.info;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Controller {

	public static void main(String[] args) {
		// IOC
		// 1] BeanFactory  2] ApplicationContext
		
		ApplicationContext context = new ClassPathXmlApplicationContext("application_config.xml");
	
		 Student s = (Student)context.getBean("student1");
		 Student s1 = (Student)context.getBean("student1");
		 Student s2 = (Student)context.getBean("student1");
		 
		 System.out.println(s.hashCode());
		 System.out.println(s1.hashCode());
		 System.out.println(s2.hashCode());
	}
}
