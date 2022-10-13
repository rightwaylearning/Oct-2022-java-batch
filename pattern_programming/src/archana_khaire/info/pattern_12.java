package archana_khaire.info;

public class pattern_12 {
	public static void main(String[] args) {
		for(int r=5; r>=1; r--) {
			for(int s=1; s<=r; s++) {
				System.out.print("* ");
			}
			 System.out.println();  
		} 
		
		char ch ='A';
		for (int c = 5; c >= 1; c--) {

			for (int d = 1; d <= c; d++) {
				System.out.print(ch+" ");
			}

			System.out.println();
			ch++;

		}

	}
}
     

