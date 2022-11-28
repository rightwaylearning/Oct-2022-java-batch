package com.tc.college.service;

import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

import com.tc.college.dao.IStudentDao;
import com.tc.college.dao.StudentDaoImpl;
import com.tc.college.models.Student;
import com.tc.college.models.TransectionStatus;

@Component
public class StudentServicesImpl implements IStudentServices {

	@Autowired
	@Qualifier("studentDaoImpl")
	public IStudentDao iStudentDao;

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

	@Override
	public Student getSingleObject(Integer id) {
		try {
		ResultSet data = iStudentDao.getStudentObject(id);
		if(data.next()) {
			Student student = new Student(data.getInt(1), data.getString(2), data.getString(3), data.getInt(4),
					data.getString(5));
			return student;
		}
		}catch(Exception e) {
			System.out.println(e);
		}
		return null;
	}

	@Override
	public Integer updateStudentObject(Student student) {
		return iStudentDao.updateStudentObject(student);
	}

	@Override
	public Integer deleteStudentObject(Integer id) {
		return iStudentDao.deleteStudentObject(id);
	}

	@Override
	public TransectionStatus fundTransper(Integer custNo, Integer payeeCustNo, Double bal) {
	  return iStudentDao.fundTransper(custNo, payeeCustNo, bal);
	}

	@Override
	public int[] saveStudentBatch(List<Student> list) {
		return iStudentDao.saveStudentBatch(list);
	}

}
