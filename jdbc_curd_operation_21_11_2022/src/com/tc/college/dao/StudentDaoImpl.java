package com.tc.college.dao;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.mysql.cj.Query;
import com.tc.college.models.Student;
import com.tc.college.models.TransectionStatus;
import com.tc.college.utility.ConstLabels;
import com.tc.college.utility.DBConnection;
import com.tc.college.utility.QueryConst;
import com.tc.college.validate.entity.ValidateStudentEntity;

@Component
public class StudentDaoImpl implements IStudentDao {

	public Connection con;

	public StudentDaoImpl() {
		try {
			this.con = DriverManager.getConnection(QueryConst.dbUrl, QueryConst.userName, QueryConst.userPwd);
		} catch (Exception e) {
		}
	}

	@Override
	public Integer saveStudentObject(Student student) {
		try {

			if (con != null && ValidateStudentEntity.validateStudentObject(student)) {
				PreparedStatement stm = con.prepareStatement(QueryConst.insertQuery);
				setParam(stm,student.getId(),student.getFirstName(),student.getLastName(),student.getAge(),student.getGender());
				int updatedRows = stm.executeUpdate();
				return updatedRows;
			}
		} catch (Exception e) {
			System.out.println(e);
		}
		return null;
	}

	@Override
	public ResultSet getStudentAllData() {
		try {
			PreparedStatement stm = con.prepareStatement(QueryConst.selectQuery);
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
			PreparedStatement stm = con.prepareStatement(QueryConst.selectSingleObject);
			stm.setInt(1, id);
			setParam(stm,id,null,null,null,null);
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
			PreparedStatement stm = con.prepareStatement(QueryConst.updateQuery);
			setParam(stm,student.getId(),student.getFirstName(),student.getLastName(),student.getAge(),student.getGender());
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
				PreparedStatement stm = con.prepareStatement(QueryConst.deleteQuery);
				setParam(stm,id,null,null,null,null);
				return stm.executeUpdate();

			} catch (Exception e) {
				System.out.println(e);
			}
		}
		return null;
	}

	private Double getBalance(Integer mineCutNo) {
		try {
			PreparedStatement stm = con.prepareStatement(QueryConst.selectSngleAccount);
			stm.setInt(1, mineCutNo);
			ResultSet r = stm.executeQuery();
			if (r.next()) {
				Double currentBal = r.getDouble(4);
				return currentBal;
			}
		} catch (Exception e) {
			System.out.println(e);
		}

		return null;
	}

	@Override
	public TransectionStatus fundTransper(Integer mineCutNo, Integer payeeCustNo, Double bal) {
		try {
			Double currentBal = getBalance(mineCutNo);
			if (currentBal >= bal) {

				con.setAutoCommit(false);

				PreparedStatement stm = con.prepareStatement(QueryConst.updateAccount);
				stm.setDouble(1, currentBal - bal);
				stm.setInt(2, mineCutNo);
				stm.executeUpdate();

				int d = 10 / 0;
				Double currentPayeeBal = getBalance(payeeCustNo);

				PreparedStatement stm1 = con.prepareStatement(QueryConst.updateAccount);
				stm1.setDouble(1, currentPayeeBal + bal);
				stm1.setInt(2, payeeCustNo);
				stm1.executeUpdate();

				TransectionStatus tx = new TransectionStatus();
				tx.setStatus(true);
				tx.setMessage(ConstLabels.successMessage);

				con.commit();
				return tx;

			}

			TransectionStatus tx = new TransectionStatus();
			tx.setStatus(false);
			tx.setMessage("Insufficient balance");
			return tx;

		} catch (Exception e) {
			try {
				con.rollback();
			} catch (Exception e1) {
			}
			System.out.println(e);
		}

		return null;
	}

	@Override
	public int[] saveStudentBatch(List<Student> list) {
		try {
			PreparedStatement stm = con.prepareStatement("insert into student values(?,?,?,?,?)");
			for (Student student : list) {
				setParam(stm,student.getId(),student.getFirstName(),student.getLastName(),student.getAge(),student.getGender());
				stm.addBatch();
			}
			int[] arr = stm.executeBatch();

		} catch (Exception e) {
			System.out.println(e);
		}
		return null;
	}

	private void setParam(PreparedStatement stm, Integer id, String firstName, 
			String lastName, Integer age,String gender) {
		try {
			if (stm != null) {

				if (id != null) {
					stm.setInt(1, id);
				}

				if (firstName != null) {
					stm.setString(2, firstName);
				}

				if (lastName != null) {
					stm.setString(3, lastName);
				}

				if (age != null) {
					stm.setInt(4, age);
				}

				if (gender != null) {
					stm.setString(5, gender);
				}
			}
		} catch (Exception e) {
			System.out.println(e);
		}
	}

}
