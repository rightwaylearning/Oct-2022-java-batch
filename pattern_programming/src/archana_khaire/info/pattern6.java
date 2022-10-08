package archana_khaire.info;

public class pattern6 {
	public static void main(String[] args) {
		int i,j;
		System.out.println("The Pattern...... ");
		for(i=1;i<=9;i=i+2) {
			for(j=9;j>=i;j=j-2) {
				System.out.print(j+" ");
			}
			System.out.println();
		}
	}

}
