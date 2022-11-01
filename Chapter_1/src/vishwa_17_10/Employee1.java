package vishwa_17_10;

// 11-10-2022---static method demo

public class Employee1 {
	
	String name;
	int empid;
	static String companyName;
	
	void m1() {
		
		System.out.println("i am a instance method");
		
		
	}
	static void m2() {
		
		System.out.println("i am a static method");
		//System.out.println(Employee1.companyName);
		
	}

}
