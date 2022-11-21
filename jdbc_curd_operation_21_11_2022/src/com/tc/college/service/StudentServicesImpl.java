package com.tc.college.service;

import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;

import com.tc.college.dao.IStudentDao;
import com.tc.college.dao.StudentDaoImpl;
import com.tc.college.models.Student;

public class StudentServicesImpl implements IStudentServices {

	public IStudentDao iStudentDao = new StudentDaoImpl();

	@Override
	public Integer saveStudentObject(Student student) {
		if (student != null) {
			return iStudentDao.saveStudentObject(student);
		}
		return null;
	}

	@Override
	public List<Student> getStudentAllData() {
		try {
			List<Student> list = new ArrayList<>();
			ResultSet data = iStudentDao.getStudentAllData();
			while (data.next()) {
				Student student = new Student(data.getInt(1), data.getString(2), data.getString(3), data.getInt(4),
						data.getString(5));
				list.add(student);
			}
			return list;
		} catch (Exception e) {
			System.out.println(e);
		}

		return null;
	}

}
