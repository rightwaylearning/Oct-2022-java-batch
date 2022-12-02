package test.com;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;


@Configuration
public class ConfigClass {

	@Bean
	public Address getStudent() {
		return new Address();
	}
}
