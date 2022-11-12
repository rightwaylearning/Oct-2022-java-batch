package com.application;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Controller {

	public static void main(String[] args) {

		ApplicationContext context = new ClassPathXmlApplicationContext("application_config.xml");

		Employee e = (Employee) context.getBean("Employee1");

		e.showData();

	}
}
