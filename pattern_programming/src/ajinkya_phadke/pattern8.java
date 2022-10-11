package ajinkya_phadke;

public class pattern8 {
	
	public static void main(String[] args) {
		int n = 5;
		
		for(int i = 1 ; i<= n ; i++) {
			
			for(int s = 1; s < i ; s++) {
				System.out.print("  ");
			}	
			
			for(int j = 5 ;j >= i ;j--) {
				System.out.print(" *");
			}
			
			System.out.println();
		}
	  }
         
 }   



