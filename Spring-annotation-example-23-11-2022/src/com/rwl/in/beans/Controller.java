package com.rwl.in.beans;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class Controller {

	public static void main(String[] args) {

		ApplicationContext app = new AnnotationConfigApplicationContext();
        
//		MovieLister m = (MovieLister)app.getBean("movieLister");
//
//		System.out.println(m.getMessage());

		MovieFinder finder = (MovieFinder)app.getBean("movieFinder");
		
		String[] names = finder.showMovieNames();
		
		for(String n:names) {
			System.out.println(n);
		}

	}
}
