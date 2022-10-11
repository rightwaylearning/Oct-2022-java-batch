package Rutuja.Nimbhore;

public class Pattern10 {
	public static void main(String[] args) {
		int n=10;
		int j=6;
		for(int r=0 ; r<n; r++)
		{
			for(int s=0; s<=n-(j-r); s++)
			{
				System.out.print("  ");
			}
				
			  for(int c=0; c<j-r; c++)
			   {
				System.out.print("* ");
			   }
			System.out.println();
			
		}
	}

}

