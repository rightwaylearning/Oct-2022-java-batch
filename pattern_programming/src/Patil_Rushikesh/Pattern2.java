package Patil_Rushikesh;

public class Pattern2 {
	
	public static void main(String[] args) {
		
		int r=1;
		char ch='A';
		for(int i=10 ; i>=r ; i--) {
			
			for(int j=1;j<=i;j++) {
				System.out.print(ch+" ");
			}
			System.out.println();
			ch++;
		}
		
	}

}
