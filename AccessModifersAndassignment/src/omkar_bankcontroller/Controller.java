package omkar_bankcontroller;

import omkar_bank.Bank;
import omkar_bank.BankInfo;

public class Controller {
	
	
public static void main(String[] args) {
	
	 BankInfo binfo = new BankInfo(); 
	
	 Bank[] array = binfo.getBankinfo();
	 
	 for(int i = 0; i<array.length;i++) {
		 
		 System.out.println(array[i].getAccName());
		 System.out.println(array[i].getAccNumber());
		 System.out.println("--------------------------");
	 }
}
}
