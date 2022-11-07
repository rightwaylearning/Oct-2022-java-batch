package ashwini_dewade.info;

public class StudentArray {

	public static void main(String[] args) {
		
		Student[] s= new Student[4];
		
		Student obj =new Student();
		obj.rollNumber=1;
		obj.Name="Manav";
		s[0]=obj;
		
		Student obj1 = new Student();
		obj1.Name="Arati";
		obj1.rollNumber= 2;
		s[1]= obj1;
		
		Student obj2 = new Student();
		obj2.Name="Keshav";
		obj2.rollNumber=3;
		s[2]=obj2;
		
		Student obj3 = new Student();
		obj3.Name="Asha";
		obj3.rollNumber=4;
		s[3]=obj3;
		
		for(int i=0; i<s.length; i++) {
		System.out.println(s[i].Name);
		System.out.println(s[i].rollNumber);
	}
}
}