package test.com;

import org.springframework.stereotype.Component;

@Component
public class MainClass {
	
	public MainClass() {
		System.out.println("&&&&&&&&");
	}
	
	public MainClass(String str) {
		System.out.println(">>>>>>>>>>>>>");
	}

	public String mesg() {
		return "Good morning india...";
	}
}
