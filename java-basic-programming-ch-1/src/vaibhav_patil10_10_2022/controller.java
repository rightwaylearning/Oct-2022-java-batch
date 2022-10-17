package vaibhav_patil10_10_2022;

public class controller {
public static void main(String[] args) {
	student s=new student();
	s.rollNumber=23;
	s.name="vaibhav";
	student.schoolName="shivraj college";
	System.out.println("rollnumber::" +s.rollNumber);
	System.out.println("Student name::" +s.name);
	System.out.println("Schoolname::"+s.schoolName);
	
	student s1=new student();
	s1.rollNumber=24;
	s1.name="tushar";
	System.out.println(s1.rollNumber);
	System.out.println(s1.name);
	System.out.println(student.schoolName);

	
}
}





