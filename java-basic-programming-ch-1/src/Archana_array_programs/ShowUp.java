package Archana_array_programs;

public class ShowUp {
	
	void printData(Student s) {
		
		System.out.println(s.name);
		System.out.println(s.rollNumber);
		System.out.println("..............");
		
		for(int i = 0;i< s.mks.length;i++) {
			
		
		System.out.println(s.mks[i]. Subject);
		System.out.println(s.mks[i].score);
		System.out.println("................");
		}
	}

}
