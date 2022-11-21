package com.software.tech;

import org.springframework.beans.BeansException;
import org.springframework.beans.factory.DisposableBean;
import org.springframework.beans.factory.InitializingBean;
import org.springframework.context.ApplicationContext;
import org.springframework.context.ApplicationContextAware;

public class A implements  ApplicationContextAware,InitializingBean, DisposableBean{
	Integer x;
	Integer y;
    
	public A() {
		System.out.println("Bean instance creation is done");
	}
	public Integer getX() {
		return x;
	}

	public void setX(Integer x) {
		System.out.println("I am setter injection");
		this.x = x;
	}

	public Integer getY() {
		return y;
	}

	public void setY(Integer y) {
		System.out.println("I am setter injection");
		this.y = y;
	}

	@Override
	public String toString() {
		return "A [x=" + x + ", y=" + y + "]";
	}

	@Override
	public void setApplicationContext(ApplicationContext arg0) throws BeansException {
		System.out.println("I am inteface injection");
		
	}
	
	@Override
	public void afterPropertiesSet() throws Exception {
		System.out.println("its afterPropertiesSet method of InitializingBean");
		
	}
	

//	public void customInit() {
//		System.out.println("I am custom init method");
//	}
	
	@Override
	public void destroy() throws Exception {
		System.out.println("I am destroy methdo of DisposableBean");
	}
	
//	public void customDestroy() {
//		System.out.println("I am custom detsroy method..");
//	}


}
