package ashwini_10_10_2022;

public class Controller {
	
	public static void main(String[] args) {
		
		Student s= new Student();
		s.name="Ashwini";
		s.roll=11;
		Student.School="Icl";
		
		Student s1 = new Student();
		s1.name="Mukund";
		s1.roll=12;
		
		
		
		
		
		Show sh = new Show();
		sh.printData(s);
		
		
		Show sh1 =new Show();
		sh1.printData(s1);
		System.out.println(Student.School);
	}

}
