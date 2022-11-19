package com.software.tech;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Controller {

	public static void main(String[] args) {
		
		ApplicationContext context = new ClassPathXmlApplicationContext("config.xml");
		A a = (A)context.getBean("a");
		System.out.println("i am ready for service...");
		System.out.println(a.toString());
	}

}
/*
   1] bean object is not exit
   2] bean is created
   3] injection (setter OR constructor)
   4] if A bean implemented aware interfaces like
 * public class A implements BeanNameAware, BeanFactoryAware, ApplicationContextAware{
 * @Override
	public void setApplicationContext(ApplicationContext arg0) throws BeansException {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void setBeanFactory(BeanFactory arg0) throws BeansException {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void setBeanName(String arg0) {
		// TODO Auto-generated method stub
		
	}

 * }
 * 5] custom -init OR/and  InitializingBean(I) afterPropertiesSet() method is called
 * 
 * 6] now bean object is ready for service, here u can use that bean object 
 * 
 * 6] custom destroy method OR / and  DisposableBean(I) destroy() method is called
 * 
 * 7] bean object is destroy.
 * 
 * 
 * 
 * 1] does not exit
 * 2] bean object creation
 * 3] setter or constructor injection
 * 4] interface injection:- 
 * 5] init
 * 6] bean is ready to serve his services 
 * 7] custom-destroy method  OR destroy 
 * 8] bean is destroy
 * 
 * 
 * 
 *  
 * 
 * 
 * 
 * 
 * 
 * 
 * 
 * 
 * 
 * 
 * 
 * 
 * 
 */
