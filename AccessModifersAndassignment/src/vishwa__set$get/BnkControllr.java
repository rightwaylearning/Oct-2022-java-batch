package vishwa__set$get;

public class BnkControllr {

	public static void main(String[] args) {
		
		            Bank[] bank =new Bank[4];
		          
		            bank[0]=new Bank("ICICI","pune",1);
			        bank[1] =new Bank("SBI","mumbai",2);
			        bank[2]=new Bank("HDFC","delhi",3);
			        bank[3] =new Bank("UNION","dondaicha",4);
		          
		          
		for (int i =0;i<bank.length;i++) {
			System.out.println(bank[i].getBankName());
			System.out.println(bank[i].getBranchName());
			System.out.println(bank[i].getToplist());
			System.out.println("_______________________");
		}
	        
	        // iiif somone says that there is another bank on 2no.?
	        
	}
	       
}
