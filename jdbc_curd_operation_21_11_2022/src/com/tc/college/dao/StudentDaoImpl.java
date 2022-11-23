package com.tc.college.dao;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

import com.tc.college.models.Student;

public class StudentDaoImpl implements IStudentDao {

	public Connection con;

	public StudentDaoImpl() {
		try {
			this.con = DriverManager.getConnection("jdbc:mysql://localhost:3306/classicmodels", "root", "root");
		} catch (Exception e) {
		}
	}

	@Override
	public Integer saveStudentObject(Student student) {
		try {
			PreparedStatement stm = con.prepareStatement("insert into student values(?,?,?,?,?)");
			stm.setInt(1, student.getId());
			stm.setString(2, student.getFirstName());
			stm.setString(3, student.getLastName());
			stm.setInt(4, student.getAge());
			stm.setString(5, student.getGender());

			int updatedRows = stm.executeUpdate();
			return updatedRows;
		} catch (Exception e) {
			System.out.println(e);
		}
		return null;
	}

	@Override
	public ResultSet getStudentAllData() {
		try {
			PreparedStatement stm = con.prepareStatement("select * from student");
			ResultSet data = stm.executeQuery();
			return data;
		} catch (Exception e) {
			System.out.println(e);
		}
		return null;
	}

	@Override
	public ResultSet getStudentObject(Integer id) {
		try {
			PreparedStatement stm = con.prepareStatement("select * from student where id = ?");
			stm.setInt(1, id);
			ResultSet data = stm.executeQuery();
			return data;

		} catch (Exception e) {
			System.out.println(e);
		}
		return null;
	}

	@Override
	public Integer updateStudentObject(Student student) {
		try {
			PreparedStatement stm = con.prepareStatement(
					"update student set first_name = ? , last_name = ?, age = ? , gender = ? where id = ?");

			stm.setString(1, student.getFirstName());
			stm.setString(2, student.getLastName());
			stm.setInt(3, student.getAge());
			stm.setString(4, student.getGender());
			stm.setInt(5, student.getId());

			return stm.executeUpdate();

		} catch (Exception e) {
			System.out.println(e);
		}
		return null;
	}

	@Override
	public Integer deleteStudentObject(Integer id) {
		if (id != null) {
			try {
				PreparedStatement stm = con.prepareStatement("delete from student where id = ?");
				stm.setInt(1, id);
				return stm.executeUpdate();

			} catch (Exception e) {
				System.out.println(e);
			}
		}
		return null;
	}

}
