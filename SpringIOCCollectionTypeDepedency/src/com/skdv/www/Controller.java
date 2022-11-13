package com.skdv.www;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.beans.factory.BeanFactory;
import org.springframework.beans.factory.xml.XmlBeanFactory;
import org.springframework.core.io.ClassPathResource;
import org.springframework.core.io.Resource;

public class Controller {

	public static void main(String[] args) {
		
		ApplicationContext context = new ClassPathXmlApplicationContext("application_config.xml");
	    
		//  Resource r = new ClassPathResource("application_config.xml");
		 // BeanFactory context = new XmlBeanFactory(r);
		
		
		
		Student s = (Student)context.getBean("stud1");
	    
	    System.out.println(s);
	    
	    System.out.println(s.getMarks().getClass().getName());
	    System.out.println(s.getSet().getClass().getName());
	}
}
