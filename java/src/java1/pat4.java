package java1;

public class pat4 {
	public static void main(String[] args) {
		int line=5;
		int col=5;
		char ch='A';
		for(int i=1;i<=line;i++) {
			for(int j=1;j<=col;j++) {
				System.out.print(ch);
				//ch--;/
			}
			System.out.println();
			col--;
		}
	}

}
