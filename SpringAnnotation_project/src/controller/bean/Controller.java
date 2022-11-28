package controller.bean;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import test.com.MainClass;

public class Controller {

	public static void main(String[] args) {
		
		ApplicationContext ctx = new ClassPathXmlApplicationContext("config.xml");
		MainClass m = ctx.getBean(MainClass.class);
		System.out.println(m.mesg());
		
	}
}
