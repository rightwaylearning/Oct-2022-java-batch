package rwl.in;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Controller {

	public static void main(String[] args) { 
		
		ApplicationContext ctx = new AnnotationConfigApplicationContext(ConfigClass.class);
		
		Student s =(Student) ctx.getBean("s");
		
		Student s1 =  (Student) ctx.getBean("student");
		
		
		
	}
}
