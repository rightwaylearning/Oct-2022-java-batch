package vishwa_17_10;

public class Patrrrn2 {
	
		public static void main(String[] args) {
			int r =4;
			
			for(int i = 1 ; i <= r ; i++) {
				
				for(int j = 1 ; j <=i ; j++) {
					System.out.print("* ");
				}
				System.out.println();
			}
			
		int w = r -1;
			for(int i = 1; i <= w ; i++) {
			
				for(int j = w ; j >= i ; j--) {
				System.out.print("* ");
			}
			
			System.out.println();
		}
		}
	}


