package online_banking.com.services;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Controller{
	public static void main(String[] args) {
		ApplicationContext ctx = new ClassPathXmlApplicationContext("NewFile.xml");
		Address adr = ctx.getBean(Address.class);
		adr.setAddressLine1("gupta square");
		adr.setCityName("NDP");
		System.out.println(adr);
	}
}