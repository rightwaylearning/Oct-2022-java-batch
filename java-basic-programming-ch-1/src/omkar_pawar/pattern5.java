package omkar_pawar;


     import java.util.Scanner;

public class pattern5 {
     public static void main(String[] args) {
    	 Scanner s = new Scanner(System.in);
    	System.out.println("Enter your row count"); 
    	 
    	 
    	 int r = s.nextInt();
    	 for (int i = 1; i <= r; i++) {
    		 for(int j = 1; j <= i ; i++) {
    			 System.out.print("* ");
    		 }
    		 System.out.println();
    	 }
    	 
     }
}