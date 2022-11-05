package omkar_bank;

public class Bank {
   private String AccName;
   private int AccNumber;
public Bank(String accName, int accNumber) {
	
	AccName = accName;
	AccNumber = accNumber;
}
public String getAccName() {
	return AccName;
}
public void setAccName(String accName) {
	AccName = accName;
}
public int getAccNumber() {
	return AccNumber;
}
public void setAccNumber(int accNumber) {
	AccNumber = accNumber;
}
   
   
}
