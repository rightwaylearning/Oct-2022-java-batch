package vaibhavPatil_26_09_2022;

public class StudentController {
	
	public static void main(String[] args) {
		Student s=new Student();
		s.name="vaibhav";
		s.scname="Shivraj college,Gadhinglaj";
		s.rollnumber=7;
		s.std=12;
		s.division='A';
		
		studentAddress st=new studentAddress();
		st.city="Gajargaon";
		st.pin=416505;
		
		
		SchoolAddress sc=new SchoolAddress();
		sc.scity="Gadhinglaj";
		sc.scpin=416502;
		
		System.out.println("Student Name="+s.name);
		System.out.println("School Name="+s.scname);
		System.out.println("Roll No.="+s.rollnumber);
		System.out.println("Standard="+s.std);
		System.out.println("Div="+s.division);
		
		System.out.println("Student Address::");
		System.out.println(st.city);
		System.out.println(st.pin);
		
		System.out.println("School Address::");
		System.out.println(sc.scity);
		System.out.println(sc.scpin);
		
	}

}
