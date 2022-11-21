package vishwa__set$get;

public class Bank {

	private String bankName;
	private String branchName;
	private int toplist;
	
	
	public Bank(String bankName, String branchName, int toplist) {
	
		this.bankName = bankName;
		this.branchName = branchName;
		this.toplist = toplist;
	}


	public String getBankName() {
		return bankName;
	}


	public void setBankName(String bankName) {
		this.bankName = bankName;
	}


	public String getBranchName() {
		return branchName;
	}


	public void setBranchName(String branchName) {
		this.branchName = branchName;
	}


	public int getToplist() {
		return toplist;
	}


	public void setToplist(int toplist) {
		this.toplist = toplist;
	}
	
}
