package Rutuja_Kauthale;

public class STController {

	public static void main(String[] args) {
		
		Student std = new Student();
		std.setStudentName("Rutuja");
		std.setRollNumber(1);
	String str =std.getStudentName();
	int rollno= std.getRollNumber();
		
		
		System.out.println(str);
		System.out.println(rollno);}
}
