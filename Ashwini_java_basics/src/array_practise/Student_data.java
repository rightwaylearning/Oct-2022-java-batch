package array_practise;

public class Student_data {

	public static void main(String[] args) {
		
		Student s=new Student();
		s.rollNumber=01;
		s.name="Sachin";
		s.div='A';
	
		
		Student s1=new Student();
		s1.rollNumber=02;
		s1.name="Archana";
		s1.div='B';
		
		Student s2=new Student();
		s2.rollNumber=03;
		s2.name="Priya";
		s2.div='C';
		
		Student s3=new Student();
		s3.rollNumber=04;
		s3.name="Ashwini";
		s3.div='D';
		
		Student [] arr=new Student[4];
		arr[0]=s;
		arr[1]=s1;
		arr[2]=s2;
		arr[3]=s3;
		
		for(int i=0;i<arr.length;i++) {
			System.out.println(arr[i].rollNumber);
			System.out.println(arr[i].name);
			System.out.println(arr[i].div);
		}
		
		
		
		
	}
}
