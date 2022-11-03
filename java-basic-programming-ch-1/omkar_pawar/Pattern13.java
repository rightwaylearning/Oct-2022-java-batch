package omkar_pawar;

public class Pattern13 {
      
      public static void main(String[] args) {
    	  int n = 10;
    	  for(int r = 1; r <= n; r++) {
    		  for(int s = 1; s <= n-r; s++) {
    			  System.out.print("  ");
    		  }
    		  
    		  for (int c = 1; c <= r; c++) {
    			  System.out.print("* ");
    		  }
    		  
    		  System.out.println();
    		  
    	  }
    	  
    	  int n1= 9;
    	  for(int r = n1; r >= 1; r--) {
    		  
    		  for(int s = 1; s <= n1-r+1; s++) {
    			  System.out.print(" ");
    			  
    		  }
    		  
    		  for(int c = 1; c <= r; c++) {
    			  
    		  
    		  System.out.print("* ");
    		  
    	  }
    	  System.out.println();
      }
     
}
}