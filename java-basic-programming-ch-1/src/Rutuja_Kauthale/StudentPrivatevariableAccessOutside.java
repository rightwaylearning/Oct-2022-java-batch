package Rutuja_Kauthale;

public class StudentPrivatevariableAccessOutside {
 private int rollno;
private String name;
private String std;
 
StudentPrivatevariableAccessOutside(){}

public StudentPrivatevariableAccessOutside(int rollno, String name, String std) {
	super();
	this.rollno = rollno;
	this.name = name;
	this.std = std;
}
	int getRollno() {
		return rollno;
	}
	
	String getName() {
		return name;
	}
	String getStd() {
		return std;
	}
	
	public void setRollno(int rollno)
		{
		this.rollno=rollno;
		
		}

	public void setName(String name) {
		this.name = name;
	}

	public void setStd(String std) {
		this.std = std;
	}
	
		}




class StudentController{
	
	public static void main(String[] args) {
		StudentPrivatevariableAccessOutside s =new StudentPrivatevariableAccessOutside(12,"Rutuja","4th");
		String n= s.getName();
		System.out.println(n);
		System.out.println("get std");
		String n1= s.getStd();
		System.out.println(n1);
		int a= s.getRollno();
		System.out.println(a);
		s.setName("Atharv");
		String b= s.getName();
		System.out.println(b);
		
	}
}
