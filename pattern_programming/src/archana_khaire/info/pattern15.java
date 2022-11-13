package archana_khaire.info;

public class pattern15 {
	public static void main(String[] args) {
		int r=0;
		int w= r-1;
		for(int i = 1;i<=w;i++) {
			for(int j=w;j>=i;j--) {
				System.out.print(" * ");
			}
			System.out.println();
		}
	}

}
