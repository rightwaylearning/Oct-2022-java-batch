package nikita_tonde;

public class Employee_ {
	
	int empId;
	String name;
	long CellPhone;
	static String OfficeName;
	
	void m1() {
		System.out.println("I am m1 method");
		
	}
	static void s1() {
		System.out.println(" I am static method");
	}
	void m2() {
		System.out.println(empId);
		System.out.println(name);
		System.out.println(CellPhone);
		
		m1();
		System.out.println(Employee_.OfficeName);
		Employee_.s1();
		
			}
	static void s2 () {
		System.out.println(Employee_.OfficeName);
		Employee_ .s1();
		Employee_ e = new Employee_ ();
		System.out.println(e.empId);
		System.out.println(e.name);
		System.out.println(e.CellPhone);
		e.m1();
		
		
		
		
		
		
	}
	
	

}
