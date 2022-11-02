package assisgmenet_of_static1;

public class Controller {

	public static void main(String[] args) {

		Student s = new Student();
		s.fname = "Nirmalsing";
		s.lname = "rajput";
		s.Rollnum = 34;

		Student.Schoolname = "D.r high school";

		System.out.println(s.fname);

		System.out.println(s.lname);

		System.out.println(s.Rollnum);

		System.out.println(Student.Schoolname);
		
		
		System.out.println("-----------------------------------------------");
		

		Student s1 = new Student();
		s1.fname = "kuldip";
		s1.lname = "rajput";
		s1.Rollnum = 65;
		Student.Schoolname = "D.r high school";

		System.out.println(s1.fname);

		System.out.println(s1.lname);

		System.out.println(s1.Rollnum);

		System.out.println(Student.Schoolname);

	}

}
