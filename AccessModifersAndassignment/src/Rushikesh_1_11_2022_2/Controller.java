package Rushikesh_1_11_2022_2;

import Rushikesh_1_11_2022.StudentInfo;
import Rushikesh_1_11_2022.Student;

public class Controller {
	
	public static void main(String[] args) {
		
		StudentInfo std=new StudentInfo();
		Student[] studentarray=std.getstudentInfo();
		
	    for(int i=0;i < studentarray.length;i++) {
	    	
	    	System.out.println(studentarray[i].getName());
	    	System.out.println(studentarray[i].getrollNo());
	    	System.out.println(studentarray[i].getbranch());
	   
	    }
		
	}

}
