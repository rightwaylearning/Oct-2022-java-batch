package nirmal_set_get;

public class Student {

	private String firstname;
	private String lastname;
	private int Rollnumber;
 
	Student(String firstname, String lastname, int Rollnumber) {

		this.firstname = firstname;
		this.lastname = lastname;
		this.Rollnumber =Rollnumber ;

	}

	public String getFirstname() {
		return firstname;
	}

	public void setFirstname(String firstname) {
		this.firstname = firstname;
	}

	public String getLastname() {
		return lastname;
	}

	public void setLastname(String lastname) {
		this.lastname = lastname;
	}

	public int getRollnumber() {
		return Rollnumber;
	}

	public void setRollnumber(int rollnumber) {
		Rollnumber = rollnumber;
	}
}
