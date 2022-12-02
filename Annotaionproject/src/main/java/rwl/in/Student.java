package rwl.in;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component("s")
public class Student {
	

	@Autowired
	public Address address;
	
	public Student() {}
	
	public Student(String str) {}
	
	public String showAddress() {
		return this.address.myAddress();
	}

	public Address getAddress() {
		return address;
	}

	public void setAddress(Address address) {
		this.address = address;
	}
	
}
