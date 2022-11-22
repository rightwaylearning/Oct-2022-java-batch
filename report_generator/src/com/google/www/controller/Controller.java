package com.google.www.controller;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.google.www.service.ReportGeneratorService;

public class Controller {

	public static void main(String[] args) {
		
		ApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");
		
		ReportGeneratorService service = (ReportGeneratorService)context.getBean("service");
		
		service.generatReport();
	}
}
