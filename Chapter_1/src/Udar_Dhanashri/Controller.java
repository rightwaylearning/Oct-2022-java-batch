package Udar_Dhanashri;

public class Controller {
	public static void main(String[] args) {
		Student s = new Student();
		s.name = "Sky";
		s.rollNumber = 21;
		
		Marks[] sub = new Marks[3];
		Marks m1 = new Marks();
		m1.subject= "Marks";
		m1.Score= 89;
		sub[0]=m1;
		
		
		Marks m2 = new Marks();
		m2.subject= "Phy";
		m2.Score= 35;
		sub[1]=m2;
		
		
		Marks m3 = new Marks();
		m3.subject= "Chem";
		m3.Score= 65;
	
		s.mks = sub;
		
		//print dada work
		
		showUp show = new showUp();
		show.printData(s);	
		
		
		
	}
	

}
