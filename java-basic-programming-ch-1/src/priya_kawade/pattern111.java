package priya_kawade;

public class pattern111 {
	public static void main(String[] args) {
		int n=5;
		
		for(int i=n;i>=1;i--) {
			for(int j=1;j<=i;j++) {
				System.out.print("* ");
			}
			for(int s=1;s<=(n*2-i*2);s++) {
				System.out.print(" ");
			}
			for(int j=1;j<=i;j++) {
				System.out.print("* ");
			}
		
		
		System.out.println();
		}
		
	}
		
}

//**********
//****--****
//***----***
//**------**
//*--------*