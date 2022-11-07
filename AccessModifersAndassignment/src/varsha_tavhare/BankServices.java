package varsha_tavhare;

public class BankServices {

	boolean getBalance() {
		return true;
	}

	//AACOUNT STATUS
 boolean isActiveAcc(long accno) {
	 return true;
 }
 boolean amountTransferLimit(double amt) {
	 return true;
	 
 }
 boolean isSufficientFund(double fundAmt) {
	 // fundAmt <= getBalance();
return true;
}
} 
}