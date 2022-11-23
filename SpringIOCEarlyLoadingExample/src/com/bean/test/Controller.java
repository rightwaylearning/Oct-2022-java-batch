package com.bean.test;

import org.springframework.beans.factory.BeanFactory;
import org.springframework.beans.factory.xml.XmlBeanFactory;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.core.io.ClassPathResource;
import org.springframework.core.io.Resource;

public class Controller {

	public static void main(String[] args) {
		
		Resource r = new ClassPathResource("config.xml");
		
		BeanFactory context = new XmlBeanFactory(r);
	
	    System.out.println("-------------------------------");
//	    
	    A a1= (A)context.getBean("a");
	}
}
