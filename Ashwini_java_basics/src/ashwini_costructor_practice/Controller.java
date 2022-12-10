package ashwini_costructor_practice;

public class Controller {
	
	public static void main(String[] args) {
		
		Student_info student_info= new Student_info(02,"Priya","Kawade");
		Student_info student_info1= new Student_info(03,"Archana","Khaire");
		Student_info student_info2= new Student_info(04,"Sachin","Nalage");
		Student_info student_info3= new Student_info(05,"Mahesh","Dewade");
		Student_info student_info4= new Student_info(06,"Ashwini","Dewade");
		
		
		Student_info[] array= {student_info,student_info1,student_info2,student_info3,student_info4};
		for(int i=0;i<array.length;i++) {
			System.out.println(array[i].rollNumber);
			System.out.println(array[i].fName);
			System.out.println(array[i].lName);
			
			
		}
		
		
	}

}
