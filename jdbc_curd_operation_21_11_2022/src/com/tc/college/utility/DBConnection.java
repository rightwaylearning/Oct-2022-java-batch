package com.tc.college.utility;

import java.sql.Connection;
import java.sql.DriverManager;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component
public class DBConnection {

	@Value("${url}")
	private String url;
	
	@Value("${userName}")
	private String userName;
	
	@Value("${pwd}")
	private String pwd;

	public String getUrl() {
		return url;
	}

	public void setUrl(String url) {
		this.url = url;
	}

	public String getUserName() {
		return userName;
	}

	public void setUserName(String userName) {
		this.userName = userName;
	}

	public String getPwd() {
		return pwd;
	}

	public void setPwd(String pwd) {
		this.pwd = pwd;
	}
	
	public Connection getConnection() {
		try {
			Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/classicmodels","root","root");
		}catch (Exception e) {
			System.out.println(e);
		}
		return null;
	}
}
