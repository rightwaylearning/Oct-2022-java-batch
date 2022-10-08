package java1;

public class pat2 {
	public static void main(String[] args) {
		int line=5;
		int col=1;
		for(int i=0;i<line;i++) {
			for(int j=0;j<col;j++) {
				System.out.print("* ");
			}
			
			System.out.println();
			col++;
		}
	}

}
