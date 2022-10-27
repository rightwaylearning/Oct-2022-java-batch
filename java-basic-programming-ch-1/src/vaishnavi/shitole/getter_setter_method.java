package vaishnavi.shitole;

public class getter_setter_method {
	
	private String name;
	private int rollNo;
	private char div;
	
	public getter_setter_method(String name, int rollNo, char div) {
		super();
		this.name = name;
		this.rollNo = rollNo;
		this.div = div;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getRollNo() {
		return rollNo;
	}
	public void setRollNo(int rollNo) {
		this.rollNo = rollNo;
	}
	public char getDiv() {
		return div;
	}
	public void setDiv(char div) {
		this.div = div;
	}
	
	
	
}
