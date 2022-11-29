package Archana_Thisdemo;

public class Controller {
	public static void main(String[] args) {
		Employee e = new Employee(15,"Aryan");
		System.out.println(e.rollNumber);
		System.out.println(e.name);
		
		System.out.println("==========================");
		
		Employee e1 = new Employee(16,"Sharayu");
		System.out.println(e1.rollNumber);
		System.out.println(e1.name);
	}

}
