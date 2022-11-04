package nirmal_set_get;

public class unioncontroller {

	public static void main(String[] args) {

		Union_bank_project u = new Union_bank_project("nirmal rajput", 54673828);
		u.BankName = "union bank";
		u.BankManager = "r k guptA";
		u.m4();
		
		System.out.println("---------------------------");
		
		Union_bank_project.m5();
		
		System.out.println("---------------------------");
		
		System.out.println(u.BankName);
		System.out.println(	u.BankManager);
		
		
		System.out.println("---------------------------");
		
		Union_bank_project.address = "at post abc ";
		System.out.println(Union_bank_project.address);
		
		System.out.println("---------------------------");

		String m = u.getBankClientName();
		long n = u.getBankClientAccNumber();

		System.out.println(m);
		System.out.println(n);

	}

}
