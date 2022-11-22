package pack1;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Controller {

	public static void main(String[] args) {
		
		ApplicationContext context = new ClassPathXmlApplicationContext("configuration.xml");
	    System.out.println(">>>"+context.hashCode());
		Student s =(Student)context.getBean("student");
	    System.out.println(s);
	}
}
