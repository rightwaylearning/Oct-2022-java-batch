package vaishnavi.shitole;

public class Static_Controller {
	
	public static void main(String[] args) {
		
		Static_Example s1 = new Static_Example();
		
		s1.studentname = "Vaishnavi";
		s1.rollNo = 04;
		s1.div='A';
		
		
		
		Static_Example s2 = new Static_Example();
		
		s2.studentname = "Niya";
		s2.rollNo = 14;
		s2.div = 'B';
		
		Static_Example.schoolName="SVPM";
		
		System.out.println(s1.studentname);
		System.out.println(s1.rollNo);
		System.out.println(s1.div);
		System.out.println(Static_Example.schoolName);

		
		System.out.println("-------------------------");

		System.out.println(s2.studentname);
		System.out.println(s2.rollNo);
		System.out.println(s2.div);
		System.out.println(Static_Example.schoolName);

		

	}
	

}
