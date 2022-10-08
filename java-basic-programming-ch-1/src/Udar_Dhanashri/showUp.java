package Udar_Dhanashri;

public class showUp {

	void printData(Student s) {
		System.out.println (s.name);
		System.out.println (s.rollNumber);
		System.out.println (">>>>>>>>>>>>>");
		
		
		for(int i=0; i<s.mks.length; i++) {
			System.out.println (s.mks[i].subject);
			System.out.println (s.mks[i].Score);
			System.out.println (">>>>>>>>>>>>>");
			
		}
		
	}

}
