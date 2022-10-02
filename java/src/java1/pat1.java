package java1;

public class pat1 {
	public static void main(String[] args) {
		int line=5;
		int col=5;
		
		for(int i=0;i<line;i++)
		{
			for(int j=0;j<col;j++)
			{
				if(j==0||i==4)
				System.out.print(" * ");
			}
			System.out.println();
		}
	}

}
