package java1;

public class numpattern {
	public static void main(String[] args ) {
		int line = 5;
		int col = 5;
		for(int i=0;i<line;i++) {
			int ch = 9;
			for(int j =0;j<col;j++) {
				System.out.print(   ch-- );
				ch = ch-1;
			}
			System.out.println();
			col --;
		}
		
	}

}
