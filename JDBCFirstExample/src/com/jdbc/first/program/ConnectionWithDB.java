package com.jdbc.first.program;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.Scanner;

public class ConnectionWithDB {
	
	public static void main(String[] args) {
		
		try {
			
			Scanner sc = new Scanner(System.in);
			Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/classicmodels","root","root");			
			PreparedStatement statement = con.prepareStatement("select * from employees where officeCode = ?");
			System.out.println("please Enter officeCode");
			statement.setInt(1, sc.nextInt());
			ResultSet result = statement.executeQuery();
			
			while(result.next()) {
				System.out.println(result.getInt(1) +" "+ result.getString(2) +" "+result.getString(3));
			}
			
		}catch(Exception e) {
			System.out.println(e);
		}
			
	}

}
