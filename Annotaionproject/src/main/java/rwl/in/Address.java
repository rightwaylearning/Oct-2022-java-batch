package rwl.in;

import java.sql.Connection;
import java.sql.PreparedStatement;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class Address {

	@Autowired
	public Connection connection;
	
	public String myAddress() {
		return "C 505, B a vermonth, wagholi pune, baif road";
		
		PreparedStatement stm = connection.prepareStatement("");
	}
}
