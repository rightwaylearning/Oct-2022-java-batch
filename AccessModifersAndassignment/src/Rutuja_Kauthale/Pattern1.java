package Rutuja_Kauthale;

import java. util.*;

class pattern1{
	

	static Scanner sc;

	public static void main(String args[])
{	
		sc = new Scanner(System.in);
		System.out.println("Enter the number you want to print the pattern");
		int n= sc.nextInt();
	
	System.out.println("your enter number is "+n);
System.out.println("----------------------------------------------------------------------");
	System.out.println("login 1st pattern printing ");
System.out.println("----------------------------------------------------------------------");
	for(int i=1;i<=n;i++)
		{
		for(int j=n;j>i;j--)
			{
			System.out.print("  ");
			}
	for(int k=1;k<=2*i;k++)
			{
			System.out.print("* ");
			}
	for(int j=n;j>i;j--)
			{
			System.out.print("  ");
			}
		System.out.println("");
		}


System.out.println("----------------------------------------------------------------------");
	System.out.println("login 2nd pattern printing ");
System.out.println("----------------------------------------------------------------------");

for (int i=0; i<n; i++)
        {
 	for (int j=n-i; j>=1; j--)
            {
                
                System.out.print(" ");
            }
  
           
            for (int j=0; j<=i; j++ )
            {
                
                System.out.print("* ");
            }
  
             for (int j=n-i; j>1; j--)
            {
                
                System.out.print(" ");
            }
            System.out.println();
}




for (int i=n; i>=0; i--)
       {
 
            
            for (int j=n-i; j>=1; j--)
            {
                
                System.out.print(" ");
            }
  
           
            for (int j=0; j<=i; j++ )
            {
                
                System.out.print("* ");
            }
  
             for (int j=n-i; j>1; j--)
            {
                
                System.out.print(" ");
            }
            System.out.println();
}


}}