package vaibhav_patil;

public class lectliveassignment {
	public static void main(String[] args) {
		int n=10;
		
		for(int i=1;i<=n;i++) {
			
			for(int j=1;j<=i;j++) {
				System.out.print(" *");
			}
			
			for(int c=1;c<=(n*2-i*2);c++) {
				System.out.print("  ");
			}
			
			for(int k=1;k<=i;k++) {
				System.out.print(" *");
			}
			
			System.out.println();
		}
		
	}

}
