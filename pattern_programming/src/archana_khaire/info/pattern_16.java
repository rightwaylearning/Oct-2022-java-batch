package archana_khaire.info;

import java.util.Scanner;

public class pattern_16 {
	public static void main(String[] args) {
		Scanner sc1 =new Scanner(System.in);
		System.out.println("Enter your Symbol...");
		String r = sc1.next();
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter your choice...");
		int n = sc.nextInt();
		
		for(int i = 1; i<=n; i++) {
			for(int s = 1;s<=n; s++) {
				System.out.print(" " );
			}
			for(int j = 1;j<=i;j++) {
				System.out.print(" " +r);
				
			}
			System.out.println();
		}
		
		int m = n-1;
		for(int i=1; i<=m; i++) {
			for(int s = 1; s<=i; s++) {
				System.out.print(" ");
			}
			for(int j = m; j>=i;j--) {
				System.out.print(" " +r);
			
			}
			System.out.println();
		}
	}

}
