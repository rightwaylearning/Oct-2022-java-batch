package vaibhavpatil_5_11_2022;

public class Bank {
	
	
	private String Accname;
	private int Accnumber;
	
	public Bank(String accname,int accnumber) {
		
		Accname=accname;
		Accnumber=accnumber;
		
		
	}

	public String getAccname() {
		return Accname;
	}

	public void setAccname(String accname) {
		Accname = accname;
	}

	public int getAccnumber() {
		return Accnumber;
	}

	public void setAccnumber(int accnumber) {
		Accnumber = accnumber;
	}
	

}
