package test;

public class Student implements Cloneable{

	private String name;
	private Integer rollNumber;
	private Address address;
	private static Student student;

	private Student() {}
	
	public static synchronized Student getObject() {
		System.out.println(">>>>>>>>>>>>>>>>");
		if(student == null) {
			student = new Student();
		}
		
		return student;
	}
		
	@Override
	protected Object clone() throws CloneNotSupportedException {
		throw new CloneNotSupportedException("dont try it's singletone");
	}
	
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public Integer getRollNumber() {
		return rollNumber;
	}

	public void setRollNumber(Integer rollNumber) {
		this.rollNumber = rollNumber;
	}
	
	public Address getAddress() {
		return address;
	}

	public void setAddress(Address address) {
		this.address = address;
	}

	@Override
	public String toString() {
		return "Student [name=" + name + ", rollNumber=" + rollNumber + ", address=" + address + "]";
	}

	
}
