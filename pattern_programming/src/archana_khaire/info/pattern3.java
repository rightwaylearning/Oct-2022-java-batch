package archana_khaire.info;


public class pattern3 {
	  void starPattern(int n) {
		  
		for(int i =1 ; i<=n; i++) {
			
		    	System.out.println("* * * *");
		}
    }
	
	public static void main(String[] args) {
		pattern3 p = new pattern3();  
			
		int input = 5;
		p.starPattern(input);
	}
}

