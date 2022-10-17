import java.util.*;
class pattern{
public static void main(String args[])
		{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the number you want to print the pattern");
		int n= sc.nextInt();
		for(int i=1;i<=n;i++)
		{
			for(int j=0;j<i;j++)
			{ 
			System.out.print("* "); 
			}
			
			for(int k=n;k>i;k--)
			{ 
			System.out.print("  ");
			}
			for(int l=n;l>i;l--)
			{ 
			System.out.print("  ");
			}
			for(int m=0;m<i;m++)
			{ 
			System.out.print("* ");
			}
			
			System.out.println(" ");
		}

System.out.println("2nd pattern");


		for(int i=1;i<=n;i++)
		{
			for(int j=0;j<i;j++)
			{ 
			System.out.print("* "); 
			}
			
			for(int k=n;k>i;k--)
			{ 
			System.out.print("  ");
			}
			for(int l=n;l>i;l--)
			{ 
			System.out.print("  ");
			}
			for(int m=0;m<i;m++)
			{ 
			System.out.print("* ");
			}
			
			System.out.println(" ");
		}

		for(int i=n;i>=n;i--)
		{
			for(int j=1;j<=i;j++)			{ 
			System.out.print("* "); 
			}
			
			for(int k=n;k>i;k--)
			{ 
			System.out.print("  ");
			}
			for(int l=n;l>i;l--)
			{ 
			System.out.print("  ");
			}
			for(int m=0;m<i;m++)
			{ 
			System.out.print("* ");
			}
			
			System.out.println(" ");
		}




		}
	}