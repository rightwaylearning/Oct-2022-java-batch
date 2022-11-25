
package com.tc.college.client;

import com.tc.college.controller.MineController;
import com.tc.college.models.Student;

public class Controller {

	public static void main(String[] args) {
		
		MineController c = new MineController();
		
		// insert single object
		Student s = new Student();
		s.setId(14);
		s.setFirstName("Kedar");
		s.setAge(37);
		s.setGender("male");
		
		Integer i = c.insertStudentObject(s);
		System.out.println("number of object inserted "+ i);
		
		// read all objects
//		List<Student> data = c.getAllStudentsData();
//		Iterator<Student> itr = data.iterator();
//		while(itr.hasNext()) {
//			Student s1 = itr.next();
//			System.out.println(s1);
//		}
//		
		// read single Object & then update
//		Student s1 = c.getStudentObject(3);
//		System.out.println("before update");
//		System.out.println(s1);
//		
//		s1.setLastName("sharma");
//		s1.setAge(32);
//		c.updateStudentObject(s1);
//		
//		System.out.println("after update");
//		Student s2 = c.getStudentObject(3);
//		System.out.println(s2);
		
		// delete  operation
//		Student s3 = c.getStudentObject(3);
//		System.out.println(s3);
//		c.deleteStudentObject(s3.getId());
//		
//		TransectionStatus obj = c.fundTransper(5678, 1234, 1000.00);
//		System.out.println(obj);
		
//		List<Student> list = new ArrayList<>();
//		Student s1 = new Student(11, "AB", "LM", 31, "male");
//		Student s2 = new Student(12, "MN", "PQ", 32, "female");
//		Student s3 = new Student(13, "CG", "OU", 34, "male");
//		list.add(s1);list.add(s2);list.add(s3);
//		c.processStudentBatch(list);
	}
}
