package Udar_Dhanashri;

public class pattern7 {
	public static void main(String[] args) {
		int a =15;
		
		for(int i = 1 ; i <= a ; i++) {
			
			for(int j = 1 ; j <=i ; j++) {
				System.out.print("* ");
			}
			System.out.println();
		}
		int w = a -1;
		for(int i = 1; i <= w ; i++) {
			
			for(int j = w ; j >= i ; j--) {
				System.out.print("* ");
			}
			
			System.out.println();
		}
	}
}
