package rwl.in;

import java.sql.Connection;
import java.sql.DriverManager;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.stereotype.Component;

@Configuration
//@ComponenScan("rwl.in")
public class ConfigClass {

	
	@Bean
	public Connection getConnection() {
		try {
		   return DriverManager.getConnection("","","");
		}catch (Exception e) {
		}
		return null;
	}
	
	@Bean
	public Student getStudent() {
		return new Student("hi");
	}
	
}
