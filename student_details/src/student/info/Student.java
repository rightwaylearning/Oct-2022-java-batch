package student.info;


public class Student {

	int rollNumber;
	String name;
	String std;
	char division;
	School s;
	Address adr;
	
	void printStudentData() {
		System.out.println(rollNumber);
		System.out.println(name);
		System.out.println(std);
		System.out.println(division);
		System.out.println(s.schoolName);
		System.out.println(s.headMaster);
		System.out.println(s.adr.line1);
		System.out.println(s.adr.line2);
		System.out.println(s.adr.landMark);
		System.out.println(s.adr.pin);
	}
}
