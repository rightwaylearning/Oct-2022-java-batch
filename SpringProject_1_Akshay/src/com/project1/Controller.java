package com.project1;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Controller {
	
	public static void main(String[] args) {
		
		ApplicationContext context = new ClassPathXmlApplicationContext ("application_config.xml");
		Student d = (Student)context.getBean("stud0");
		Student d1 = (Student)context.getBean("stud1");
		d.showData();
		d1.showData();
	}

}
