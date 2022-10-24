package nirmal_set_get;

public class School {
	
	String name;
	String headMaster;
	int grade;
	
	
	void m2() {
		System.out.println("i am instance method");
	}
	
	
	static void m1() {
		System.out.println("i am static method");
		
	}
	
	
	public School(String name, String headMaster, int grade) {
		super();
		this.name = name;
		this.headMaster = headMaster;
		this.grade = grade;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getHeadMaster() {
		return headMaster;
	}

	public void setHeadMaster(String headMaster) {
		this.headMaster = headMaster;
	}

	public int getGrade() {
		return grade;
	}

	public void setGrade(int grade) {
		this.grade = grade;
	}

	
	
}


