package logic_buildingby_nirmal;

public class pattern7 {

	public static void main(String[] args) {
		
		int r = 15;
		
		for(int i = 1; i <= r; i++) {
			
			for(int m = 1; m <= i; m++ ) {
				System.out.print("* ");
				
		   }
            System.out.println();
     	}
		
		int w = r-1;
		for(int n = 1; n <= w; n++) {
			for(int l = w; l >= n; l--) {
				System.out.print(" *");
				
			}
			System.out.println();
		}
		
    }
}

     


     
