package Rutuja.Nimbhore;

public class StudentArrayDemo {
	public static void main(String[] args) {
		Student[ ] s =new Student[3];
					
					Student obj= new Student();
					obj.rollNumber=4;
					obj.name="tushar";
		s[0]=obj;
		
		
					Student obj1= new Student();
					obj1.rollNumber=5;
					obj1.name="rahul";
		s[1]=obj1;
		
		
					Student obj2= new Student();
					obj2.rollNumber=6;
					obj2.name="kumar";
		s[2]=obj2;
		
		System.out.println(s[0].rollNumber);
		System.out.println(s[0].name);
		System.out.println(">>>>>>>>>>>>>>>>>>>>>>>");
		System.out.println(s[1].rollNumber);
		System.out.println(s[1].name);
		System.out.println(">>>>>>>>>>>>>>>>>>>>>>>>>>");
		System.out.println(s[2].rollNumber);
		System.out.println(s[2].name);
		
	}
}
