package Vinayak_Landge;

public class Pattern3 {

	public static void main(String[] args) {

		char ch = 'A';
		for (int i = 1; i <= 4; i++) {

			for (int j = 1; j <= i; j++) {

				System.out.print(ch + " ");
			}

			System.out.println();
			ch++;
		}
		
		for (int i = 1; i <= 4; i++) {

			for (int j = 4; j >= i; j--) {

				System.out.print(ch + " ");
			}

			System.out.println();
			ch++;
		}System.out.println("---------------");
		
		for(int i= 1; i<=4 ; i++) {
			
			for(int j = 4; j>=i; j--)
			{
				
				System.out.print(ch+" ");
				ch++;
			}
			System.out.println();
			
		}
	}
}
