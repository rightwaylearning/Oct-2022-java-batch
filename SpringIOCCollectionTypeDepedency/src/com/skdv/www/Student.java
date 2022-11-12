package com.skdv.www;

import java.util.List;
import java.util.Map;
import java.util.Properties;
import java.util.Set;

public class Student {

	String studentName;
	Integer rollNumber;
	List<Integer> marks;
	List<Address> adr;
	Set set;
	Map<Integer, String> map;
	Properties p;
	
	public String getStudentName() {
		return studentName;
	}
	public void setStudentName(String studentName) {
		this.studentName = studentName;
	}
	public Integer getRollNumber() {
		return rollNumber;
	}
	public void setRollNumber(Integer rollNumber) {
		this.rollNumber = rollNumber;
	}
	public List<Integer> getMarks() {
		return marks;
	}
	public void setMarks(List<Integer> marks) {
		this.marks = marks;
	}
	public List<Address> getAdr() {
		return adr;
	}
	public void setAdr(List<Address> adr) {
		this.adr = adr;
	}
	
	
	public Set getSet() {
		return set;
	}
	public void setSet(Set set) {
		this.set = set;
	}
	
	
	public Map<Integer,String> getMap(){
		return this.map;
	}
	
	
	
	public Properties getP() {
		return p;
	}
	public void setP(Properties p) {
		this.p = p;
	}
	public void setMap(Map<Integer, String> map) {
		this.map = map;
	}
	@Override
	public String toString() {
		return "Student [studentName=" + studentName + ", rollNumber=" + rollNumber + ", marks=" + marks + ", adr="
				+ adr + ", set=" + set + ", map=" + map + ", properties=" + p + "]";
	}
	
	
}
