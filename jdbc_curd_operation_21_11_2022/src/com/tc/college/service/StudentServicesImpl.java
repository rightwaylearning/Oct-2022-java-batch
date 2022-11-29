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
		if (student != null && iStudentDao != null) {
			return iStudentDao.saveStudentObject(student);
		}
		return null;
	}

	@Override
	public List<Student> getStudentAllData() {
		if (iStudentDao != null) {
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
		}
		return null;
	}

	@Override
	public Student getSingleObject(Integer id) {
		if (id != null && iStudentDao != null) {
			try {
				ResultSet data = iStudentDao.getStudentObject(id);
				if (data.next()) {
					Student student = new Student(data.getInt(1), data.getString(2), data.getString(3), data.getInt(4),
							data.getString(5));
					return student;
				}
			} catch (Exception e) {
				System.out.println(e);
			}
		}
		return null;
	}

	@Override
	public Integer updateStudentObject(Student student) {
		if (student != null && iStudentDao != null) {
			return iStudentDao.updateStudentObject(student);
		}
		return null;
	}

	@Override
	public Integer deleteStudentObject(Integer id) {
		if (id != null && iStudentDao != null) {
			return iStudentDao.deleteStudentObject(id);
		}
		return null;
	}

	@Override
	public TransectionStatus fundTransper(Integer custNo, Integer payeeCustNo, Double bal) {
		if (iStudentDao != null && custNo != null && payeeCustNo != null && bal != null && bal > 0) {
			return iStudentDao.fundTransper(custNo, payeeCustNo, bal);
		}
		return null;
	}

	@Override
	public int[] saveStudentBatch(List<Student> list) {
		if (iStudentDao != null &&  list != null && list.size() > 0 ) {
			return iStudentDao.saveStudentBatch(list);
		}
		return null;
	}

}
