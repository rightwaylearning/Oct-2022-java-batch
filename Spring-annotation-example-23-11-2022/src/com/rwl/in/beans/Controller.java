package com.rwl.in.beans;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.rwl.in.dao.MovieFinder;

public class Controller {

	public static void main(String[] args) {

		ApplicationContext app = new ClassPathXmlApplicationContext("Config.xml");

		MovieLister lister = app.getBean(MovieLister.class);
		MovieFinder finder = lister.getFinder();
		
		String[] names = finder.showMovieNames();
		
		for(String n:names) {
			System.out.println(n);
		}
		System.out.println(lister.getMessage());

	}
}
