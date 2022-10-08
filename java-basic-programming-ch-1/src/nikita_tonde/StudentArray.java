package nikita_tonde;

public class StudentArray {
	public static void main (String []args) {
		
		Student [] s= new Student [3];
		Student obj=new Student();
		obj.rollNumber=22;
		obj.name= "madhura";
		
		
		s[0]=obj;
		
		Student obj1 = new Student ();
		obj1.rollNumber = 32;
		obj1.name = "monali";
		
		s[1] = obj1;
		
		System.out.println(s[0].rollNumber );
		System.out.println(s[0].name);
		System.out.println(s[1].name);
		System.out.println(s[1].rollNumber);
		
		
				
	}

}
