package Archana_array_programs;

public class Controller {
	public static void main(String[] args) {
		Student s = new Student();
		s.name = "Saee";
		s.rollNumber = 25;
		                   Marks[] sub = new Marks[3];
		                       Marks m1 =new Marks();
		                       m1.Subject = "Maths";
		                       m1.score = 98;
		                   sub[0] = m1;
		                       Marks m2 = new Marks();
		                       m2.Subject = "Bio";
		                       m2.score = 87;
		                   sub[1] = m2;
		                        Marks m3 = new Marks();
		                        m3.Subject = "Phy";
		                        m3.score = 86;
		                     sub[2] = m3;   
		                   
		  s.mks = sub;
		  ShowUp show = new ShowUp();
		  show.printData(s);
		                   
	}

}
