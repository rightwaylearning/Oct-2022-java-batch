package vaishnavi_lolage_11_10;

public class Employ {
	int empId;
	String name;
	long cellPh;
	static String officeName;
	
	
	void m1()
	{	
		System.out.println("i am instance method");
		
	}

	
	static void s1() {
		System.out.println("i am static method");
		
	}
	
	void m2() {
		
		System.out.println(empId);
		System.out.println(name);
		System.out.println(cellPh);
		System.out.println(Employ.officeName);
		m1();
		Employ.s1();
	}
	
	static void s2() {
		Employ e =new Employ();
		System.out.println(e.empId);
		System.out.println(e.name);
		System.out.println(e.cellPh);
		System.out.println(Employ.officeName);
		e.m1();
		Employ.s1();
	}
	
}
