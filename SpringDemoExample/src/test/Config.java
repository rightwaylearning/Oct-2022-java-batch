package test;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.*;

@Configuration
public class Config {

//	@Bean
//	public Student getStudent() {
//		return new Student();
//	}
	@Bean
	public Address getAddress() {
		Address adr = new Address();
				adr.setLine1("Hi hello");
		return adr;
	}
}
