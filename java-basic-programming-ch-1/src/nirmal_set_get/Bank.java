package nirmal_set_get;

public class Bank {

	private String Bankname;
	private String ManagerName;
	private int Bankemployee;
	static String CashierName;

	Bank() {

	}

	void m1() {
		System.out.println("i am a m1 instance method");
		System.out.println("i am a m1 method of class bank");
		System.out.println("------------------------");
	}

	static void m2() {
		System.out.println("i am a m2 static method");
		System.out.println("i am a m2 method of class bank");
		System.out.println("------------------------");

	}

	public String getBankname() {
		return Bankname;
	}

	public void setBankname(String bankname) {
		Bankname = bankname;
	}

	public String getManagerName() {
		return ManagerName;
	}

	public void setManagerName(String managerName) {
		ManagerName = managerName;
	}

	public int getBankemployee() {
		return Bankemployee;
	}

	public void setBankemployee(int bankemployee) {
		Bankemployee = bankemployee;
	}

}
