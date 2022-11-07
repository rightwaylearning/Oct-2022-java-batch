package Rushikesh_17_10_2022;

public class Controller {
	
	public static void main(String[] args) {
		
		Student s=new Student("Rushikesh",55,"Production Engineering");
		s.setRollNo(79);
		System.out.println(s.getName());
		System.out.println(s.getRollNo());
		System.out.println(s.getBranch());
		
		
		System.out.println("--------------------------------------------");
		
		Student s1=new Student();
		s1.setName("ram");
		s1.setbranch("Mechanical Engineering");
		s1.setRollNo(90);
		System.out.println(s1.getName());
		System.out.println(s1.getBranch());
		System.out.println(s1.getRollNo());
	}

}
