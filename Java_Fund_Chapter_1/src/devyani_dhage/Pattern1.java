package devyani_dhage;

public class Pattern1 {
	
	public static void main(String[] args) {
		for(int i=1; i<=5; i++)
		{
			for (int c=1; c<=i; c++)
			{
				System.out.print("* ");
			}
			System.out.println();
		}
		System.out.println(">>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>");
		char ch='A';
		for(int r=1; r<=5; r++)
		{
			for(int c=1; c<=r; c++)
			{
				System.out.print(ch+" ");
			}
			System.out.println();
			ch++;
		}
	}
	}


