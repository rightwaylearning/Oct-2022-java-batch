package nirmal_static_method;

public class Employee {
	String firstname;
	String lastname;
	int id;
	static String companyname;

	void m() {
		System.out.println("i am instance method");
	}

	static void n() {
		System.out.println("i am a n static method");

	}

	static void m1() {
		System.out.println("i am a static method");
	}

	void m2() {
		System.out.println(firstname);
		System.out.println(lastname);
		System.out.println(id);

		System.out.println(companyname);

		m();
		m1();
		Employee.n();

//		we can write static method in instance method
		Employee.m1();
	}

	static void n2() {
		System.out.println(companyname);
		n();
		m1();

//		in this static method we can write only static method

//		we can access instance method in static method by creating object 

		Employee e = new Employee();
		System.out.println(e.firstname);
		System.out.println(e.lastname);
		System.out.println(e.id);
		e.m2();
		e.m();
	}
}
