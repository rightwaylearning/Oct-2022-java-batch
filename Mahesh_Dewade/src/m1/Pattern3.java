package m1;

public class Pattern3 {
	void behaviourline(int n ) {
		for (int i = 1; i <= n; i++)
			System.out.print("*");
	
	   System.out.println( );
	}
        
	public static void main(String[] args) {
		Pattern3 c = new Pattern3();
		c.behaviourline(10);
		c.behaviourline(8);
		c.behaviourline(6);
		c.behaviourline(4);
		c.behaviourline(2);
		c.behaviourline(0);
	}
}

	

