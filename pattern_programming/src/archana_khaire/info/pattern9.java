package archana_khaire.info;

public class pattern9 {
	public static void main(String[] args) {
		int r=8;
		for(int i=1;i<=r;i++) {
			for(int j=1;j<=i;j++) {
				System.out.print(" * ");
			}
			System.out.println();
		}
		
		
	
		int w=r-1;
		//int r;
		for(int i=1; i<=w;i++) {
			for(int j=w;j>=i;j--) {
				System.out.print(" * ");
			}
			System.out.println();
		}
	}

}
