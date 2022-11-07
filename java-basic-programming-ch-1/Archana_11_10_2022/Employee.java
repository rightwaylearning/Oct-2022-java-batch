package Archana_11_10_2022;

public class Employee {
	int rollNo;
	String name;
	long cellPhone;
	static String officeName;
	
	void e1() {
		System.out.println("i am e1 method...");
	}
	
	static void s1() {
		System.out.println("i am static method...");
	}
	
	void e2() {
		System.out.println(rollNo);
		System.out.println(name);
		System.out.println(cellPhone);
		e1();
		
		System.out.println(officeName);
		s1();
		//Employee.officeName;
		//Employee.s1();

	}
	
	static void s2() {
		System.out.println(officeName);
		s1();
		 
		
		Employee e =new Employee();
		System.out.println(e.rollNo);
		System.out.println(e.name);
		System.out.println(e.cellPhone);
		e.e1();
	}

}
