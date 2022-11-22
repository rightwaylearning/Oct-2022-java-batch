package com.tc.college.client;

import java.util.Iterator;
import java.util.List;

import com.tc.college.controller.MineController;
import com.tc.college.models.Student;

public class Controller {

	public static void main(String[] args) {
		
		MineController c = new MineController();
		
//		Student s = new Student();
//		s.setId(3);
//		s.setFirstName("Kedar");
//		s.setLastName("Jadhav");
//		s.setAge(37);
//		s.setGender("male");
//		
//		int i = c.insertStudentObject(s);
//		System.out.println("number of object inserted "+ i);
		
		List<Student> data = c.getAllStudentsData();
		Iterator<Student> itr = data.iterator();
		while(itr.hasNext()) {
			Student s1 = itr.next();
			System.out.println(s1);
		}
	}
}
