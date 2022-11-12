package nirmal_set_get;

public class bankcontroller {

	public static void main(String[] args) {

		Bank b = new Bank();
		Bank.CashierName = "sandip ji";
		System.out.println(Bank.CashierName);
		
		System.out.println("-----------------------------");
		
		
		b.setBankname("state bank of india");
		b.setManagerName("g s mishra");
		b.setBankemployee(500);
		b.m1();
		Bank.m2();

		String a1 = b.getBankname();
		String a2 = b.getManagerName();
		int a3 = b.getBankemployee();

		System.out.println(a1);
		System.out.println(a2);
		System.out.println(a3);

	}

}
