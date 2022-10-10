package ajinkya_phadke;

public class pattern5 {

	public static void main(String[] args) {
		int r =15;
		
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
