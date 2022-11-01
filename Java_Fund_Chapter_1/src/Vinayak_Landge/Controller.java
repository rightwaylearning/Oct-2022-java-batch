package Vinayak_Landge;

public class Controller {

	public static void main(String[] args) {
		
		Student_Info s = new Student_Info();
		
		Student_Info s1 = new Student_Info(1,"Abhijit","Pawar");
		
		System.out.println(s.rollNo);
		System.out.println(s.fName);
		System.out.println(s.lName);

		System.out.println("-----------");


		
		System.out.println(s1.rollNo);
		System.out.println(s1.fName);
		System.out.println(s1.lName);


		
		
	}
}
