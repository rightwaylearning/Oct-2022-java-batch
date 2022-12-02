package com.tc.college.utility;

public interface QueryConst {

	public final static String insertQuery = "insert into student values(?,?,?,?,?)";
	public final static String dbUrl = "jdbc:mysql://localhost:3306/classicmodels";
	public final static String userName = "root";
	public final static String userPwd = "root";
	public final static String selectQuery = "select * from student";
	public final static String updateQuery = "update student set first_name = ? , last_name = ?, age = ? , gender = ? where id = ?";
	public final static String deleteQuery = "delete from student where id = ?";
	public final static String  selectSingleObject = "select * from student where id = ?";
	public final static String selectSngleAccount ="select * from account where cust_no = ?";
	public final static String updateAccount= "update account set bal= ? where cust_no= ?";
}
