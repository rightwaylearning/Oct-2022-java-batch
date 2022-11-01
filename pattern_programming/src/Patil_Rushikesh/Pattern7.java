package Patil_Rushikesh;

import java.util.Scanner;

public class Pattern7 {
	
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the number of rows: ");
		int r=sc.nextInt();
		
		for(int i=1;i<=r;i++) {
			
			for(int j=1;j<=i;j++) {
				
				System.out.print("* ");
				
			}
			
			System.out.println();
		}
		
		int x=r-1;
		for(int i=x; i>=1 ;i--) {
			
			for(int j=1;j<=i;j++) {
				
				System.out.print("* ");
				
			}
			System.out.println();
		}
		
	}

}
