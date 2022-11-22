package com.tc.college.service;

import java.util.List;

import com.tc.college.models.Student;

public interface IStudentServices {

	public Integer saveStudentObject(Student student);
	public List<Student> getStudentAllData();
	public Student getSingleObject(Integer id);
	public Integer updateStudentObject(Student student);
	public Integer deleteStudentObject(Integer id);
}
