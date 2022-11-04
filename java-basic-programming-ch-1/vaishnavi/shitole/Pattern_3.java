package vaishnavi.shitole;

public class Pattern_3 {
	
	public static void main(String[] args) {
		int r = 10;
		
		for(int i = 1; i<=r; i++ ) {
			
			for(int j=1;j<=i;j++) {
				System.out.print("* ");
			}
			
			System.out.println("");
		}
		
		int w=r-1;
		for(int i=w; i>=1 ; i--) {
			
			for(int j=1;j<=i;j++) {
				System.out.print("* ");
			}
			
			System.out.println("");
		}
		
	}

}
