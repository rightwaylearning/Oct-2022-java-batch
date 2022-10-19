package Vinayak_Landge;

public class College {
	
	String collegeName;
	String collegeAdd;
	int collegeId;
	static String university;
	
	void cm() {
		
		System.out.println("This is instance method cm");
	}
	
	static void mm() {
		
		System.out.println("This is static method mm");
		
	}
	
	void vv() {
		
		System.out.println(collegeName);
		System.out.println(collegeAdd);
		System.out.println(collegeId);
		System.out.println(College.university);
		
		//College.mm();
		//cm();
		
		}
}