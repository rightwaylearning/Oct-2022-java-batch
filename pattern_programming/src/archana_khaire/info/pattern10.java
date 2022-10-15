package archana_khaire.info;

public class pattern10 {
	public static void main(String[] args) {
		int n =5;
		for(int i =1;i<=n;i++) {
			for(int j=1;j<=i;j++) {
				System.out.print("* ");
			}
			for(int s=1;s<=(n*2-i*2);s++)
				
			System.out.print("  " );
		}
		System.out.println();
	}

}
