package test;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Controller {

	public static void main(String[] args) {
		
//	    
//	    ApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");
//		Student s = (Student)context.getBean("id");
//		Student s1 = (Student)context.getBean("id");
//		Student s2 = (Student)context.getBean("id1");
//		
//		System.out.println(s==s1);  // true
//		
//		System.out.println(s1==s2);  // false
//		System.out.println(s ==s2);  //  false
//		
//		
//		//System.out.println(s);
		
		AnnotationConfigApplicationContext app= new AnnotationConfigApplicationContext();
		app.register(Config.class);
		//app.refresh();
		
		Address adr = app.getBean(Address.class);
		System.out.println(adr);
		
	}
}
