package Rutuja.Nimbhore;

public class PatternPrinting {
	
		void printStartPrinting(int n)
		{
			for(int i=1; i<=n; i++)
			{
				System.out.println("* * * *");
			}
		}
		public static void main(String[] args) 
		{
			
			PatternPrinting p= new PatternPrinting();
			int input=10;
			p.printStartPrinting(input);
	}

}
