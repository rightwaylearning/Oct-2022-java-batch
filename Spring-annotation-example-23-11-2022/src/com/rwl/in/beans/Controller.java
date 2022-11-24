package com.rwl.in.beans;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Controller {

	public static void main(String[] args) {
		ApplicationContext ctx = new ClassPathXmlApplicationContext("config.xml");
		MovieLister m = ctx.getBean(MovieLister.class);
		MovieFinder f = m.getFinder();
		f.showMovieNames();
		System.out.println(m.getMessage());
	}
}
