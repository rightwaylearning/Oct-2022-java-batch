package Vinayak_Landge;

public class Student_AController {

	public static void main(String[] args) {
	
	A1 a = new A1(50, 60);
	
	System.out.println(a.getX());
	
	System.out.println(a.getY());
	
	a.setX(65);
	
	System.out.println(a.getX());
	
	a.setY(88);
	
	System.out.println(a.getY());
	
	System.out.println("-----------------------------");

	
	//------------------------------------------------------
	
		Student_A sa = new Student_A("Suresh",11,"FYBCS");
		
		System.out.println(sa.getName());
		
		System.out.println(sa.getRollNumber());
		
		System.out.println(sa.getStd());
		
		sa.setName("Mangesh");
		
		System.out.println(sa.getName());

		System.out.println("-----------------------------");

		
		//-------------------------------------------------------
		
		Student_A sa1 = new Student_A();
		
		sa1.setName("Sudesh");
		
		System.out.println(sa1.getName());

		



}
}