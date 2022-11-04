package tushar.yarolkar;

public class Student {

	int rollno;
	String name;
	static String collegeName;
	
	void m1() {
		System.out.println("i am a instance method" );
		 
		
		
	}
	 
	static void m2() {
		System.out.println("i am a static method");
		
	}
	void n1() {
		m1();
		Student.m2();
		System.out.println(rollno);
		System.out.println(name);
		
		
	}
}
