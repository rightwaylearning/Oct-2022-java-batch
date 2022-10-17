import java. util.*;

class Login{

public static void main(String args[])
{
	

	Scanner sc=new Scanner(System.in);
	System.out.println("Enter the number you want to print the pattern");
	int n= sc.nextInt();
	
	System.out.println("your enter number is "+n);
System.out.println("----------------------------------------------------------------------");
	System.out.println("login 1st pattern printing ");
System.out.println("----------------------------------------------------------------------");
	for(int i=0;i<=n;i++)
		{
		for(int j=0;j<i;j++)
			{
			System.out.print("*");
			}
		System.out.println("");
		}
System.out.println("----------------------------------------------------------------------");
System.out.println("login 2nd pattern printing ");
System.out.println("----------------------------------------------------------------------");
		for(int i=0;i<=n;i++)
		{
		for(int j=n;j>=i;j--)
			{
			System.out.print("*");
			}
		System.out.println("");
		}
System.out.println("----------------------------------------------------------------------");
System.out.println("login 3rd pattern printing ");
System.out.println("----------------------------------------------------------------------");
	for(int i=0;i<=n;i++)
		{
		for(int j=0;j<i;j++)
			{
			System.out.print("*");
			}
		System.out.println("");
		}
	for(int i=0;i<n;i++)
		{
		for(int j=n-1;j>i;j--)
			{
			System.out.print("*");
			}
		System.out.println("");
		}

System.out.println("----------------------------------------------------------------------");
System.out.println("login 4th pattern printing ");
System.out.println("----------------------------------------------------------------------");
for(int i=1;i<=n;i++)
		{
		for(int j=1;j<=n-i;j++)
			{
			System.out.print("# ");
			}
		for(int j=1;j<=i;j++)
			{
			System.out.print("* ");
			}

		System.out.println("");
		}
System.out.println("----------------------------------------------------------------------");
System.out.println("login 5th pattern printing ");
System.out.println("----------------------------------------------------------------------");
for(int i=1;i<=n;i++)
		{
		for(int j=1;j<=n-i;j++)
			{
			System.out.print(" ");
			}
		for(int j=1;j<=i;j++)
			{
			System.out.print("* ");
			}

		System.out.println("");
		}

		
System.out.println("----------------------------------------------------------------------");
System.out.println("login 6th pattern printing ");
System.out.println("----------------------------------------------------------------------");
for(int i=1;i<=n;i++)
		{
		for(int j=1;j<=n-i;j++)
			{
			System.out.print(" ");
			}
		for(int j=1;j<=i;j++)
			{
			System.out.print("* ");
			}

		System.out.println("");
		}
}
}
