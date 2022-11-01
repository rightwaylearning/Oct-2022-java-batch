package Udar_Dhanashri;

public class Employee1_11_10 {
	int empId;
	String name;
	long cellPhone;
	static String officeName;
	
	void m1(){
		System.out.println("Iam m1 method");
	}
	static void s1() {
		System.out.println("I am static method");
	}
	void m2() {
		System.out.println(empId);
		System.out.println(name);
		System.out.println(cellPhone);
		
		m1();
		
		System.out.println(officeName); //Employee officeName
		s1();							//Employee.s1();
	}
	static void s2() {
		System.out.println(officeName);
		s1();
		
		Employee1_11_10 e = new Employee1_11_10();
		System.out.println(e.empId);
		System.out.println(e.name);
		System.out.println(e.cellPhone);
		
		e.m1();
		
		}
	

}
