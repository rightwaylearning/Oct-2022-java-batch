package Rushikesh_11_10_2022;

public class Student {
	
	int rollNo;
	String name;
	long mobileNo;
	static String schoolName;
	
	void m1(){
		System.out.println("I am m1 method");
	}
	
	static void s1() {
		
		System.out.println("I am Static Method");
		
	}
	
	void m2() {
		System.out.println(rollNo);
		System.out.println(name);
		System.out.println(mobileNo);
		m1();
		
		System.out.println(Student.schoolName);
		System.out.println(Student.s1());
	}

}
