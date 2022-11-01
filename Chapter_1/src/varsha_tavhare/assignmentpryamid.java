package varsha_tavhare;

public class assignmentpryamid {
 public static void main(String[] args) {
		 int n = 5;
		  for (int r = 1; r <= n ; r++) {
			  for(int j = 1 ; j<= n - r ; j++) {
				  System.out.print("   ");
			  }
			  for(int k = 1; k<=(2*r-1); k++) {
				  System.out.print(" * ");
			  }
			  System.out.println();
		  }
      }
 }
