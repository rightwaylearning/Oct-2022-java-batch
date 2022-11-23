package in.co.rightwaylearning.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;



import in.co.rightwaylearning.models.Student;
import in.co.rightwaylearning.utility.ConnectionObject;

public class StudentDaoImpl implements StudentDao {
	Connection con;

	public StudentDaoImpl() {
		con = ConnectionObject.getConnection();
	}

	@Override
	public Integer save(Student student) throws SQLException {

		PreparedStatement stm = con.prepareStatement("insert into student value(?,?,?,?,?)");

		stm.setInt(1, student.getId());
		stm.setString(2, student.getFirstName());
		stm.setString(3, student.getLastName());
		stm.setInt(4, student.getAge());
		stm.setString(5, student.getGender());

		return stm.executeUpdate();
	}

	@Override
	public Integer update(Student student) throws SQLException {

		PreparedStatement stm = con
				.prepareStatement("update student set first_name =?,last_name =?,age=?,gender? where id = ?");
		stm.setString(1, student.getFirstName());
		stm.setString(2, student.getLastName());
		stm.setInt(3, student.getAge());
		stm.setString(4, student.getGender());
		stm.setInt(5, student.getId());
		return stm.executeUpdate();
	}

	@Override
	public Integer delete(Student student) throws SQLException {
		PreparedStatement stm = con.prepareStatement("delete from student where id = ?");
		stm.setInt(1, student.getId());
		return stm.executeUpdate();
	}

	@Override
	public ResultSet read() throws SQLException {
		PreparedStatement stm = con.prepareStatement("select * from student");
		ResultSet records = stm.executeQuery();
		return records;
	}
	
	@Override
	public ResultSet read(Integer id) throws SQLException {
		PreparedStatement stm = con.prepareStatement("select * from student where id = ?");
		stm.setInt(1, id);
		ResultSet records = stm.executeQuery();
       	return records;
	}

}
