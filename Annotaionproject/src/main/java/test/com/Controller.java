package test.com;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class Controller {

	public static void main(String[] args) {
		ApplicationContext  app = new AnnotationConfigApplicationContext(ConfigClass.class);
		
		Address s = app.getBean(Address.class);
		s.mesg();
	}
}
