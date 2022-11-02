package nirmal_set_get;

public class Union_bank_project {

	String BankName;
	String BankManager;
	private String BankClientName;
	private long BankClientAccNumber;
	static String address;

	public Union_bank_project(String bankClientName, int bankClientAccNumber) {

		BankClientName = bankClientName;
		BankClientAccNumber = bankClientAccNumber;
	}
	
	void m4() {
		System.out.println("i am a instance method");
	}
   static void m5() {
	   System.out.println("i am a static method");
	   
   }
	public String getBankClientName() {
		return BankClientName;
	}

	public void setBankClientName(String bankClientName) {
		BankClientName = bankClientName;
	}

	public long getBankClientAccNumber() {
		return BankClientAccNumber;
	}

	public void setBankClientAccNumber(int bankClientAccNumber) {
		BankClientAccNumber = bankClientAccNumber;
	}

}
