package com.application;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Controller {

	public static void main(String[] args) {

		ApplicationContext context = new ClassPathXmlApplicationContext("app.config.xml");

		Address e = (Address) context.getBean("Adr");

		
		System.out.println(e);
//		e.showData();

	}
}
