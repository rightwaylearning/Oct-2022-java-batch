package online_banking.com.services;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Controller{
	public static void main(String[] args) {
<<<<<<< HEAD
		ApplicationContext ctx = new ClassPathXmlApplicationContext("NewFile.xml");
		Address adr = ctx.getBean(Address.class);
		adr.setAddressLine1("gupta square");
		adr.setCityName("NDP");
		System.out.println(adr);
=======
	
		ApplicationContext ctx = new AnnotationConfigApplicationContext(Config.class);
		
		Address adtr = ctx.getBean(Address.class);
		
		adtr.setCityName("Pune");
		
		System.out.println(adtr);
		
>>>>>>> 39f6d829115c2524c64937a6ac1dee784f7a5495
	}
}