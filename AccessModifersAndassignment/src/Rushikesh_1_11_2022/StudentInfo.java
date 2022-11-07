package Rushikesh_1_11_2022;

public class StudentInfo {
	
	public Student[] getstudentInfo() {
		
		Student[] s=new Student[3];
		s[0]=new Student("Rushikesh",55,"Production Engineering");
		s[1]=new Student("Raghav",59,"Computer Engineering");
		s[2]=new Student("Rishabh",52,"Mechanical Engineering");
		
		return s;
	}
}
