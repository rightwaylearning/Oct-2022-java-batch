package archana_khaire.info;

public class pattern9 {
	public static void main(String[] args) {
		int w=r-1;
		int r;
		for(int i=1; i<=w;i++) {
			for(int j=w;j>=i;j--) {
				System.out.println(" * ");
			}
			System.out.println();
		}
	}

}
