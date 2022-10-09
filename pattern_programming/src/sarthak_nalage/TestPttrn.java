package sarthak_nalage;

public class TestPttrn {
	


	    public static void main(String[] args) {

	       // System.out.println("Hello world!");
	        for (int i = 0; i < 5; i++) {  //just replace 5 with no. of line you want to print
	            // char ch='A';
	            int k;
	            for (int j = 0; j <= i; j++) {
	                System.out.print("*" + " ");
	            }
	            for ( k = i + 1; k < 10 - i-1; k++) { //just replace 10 with no - symbol you want to print 
	                System.out.print("-"+" ");
	            }

	            for (int l = k+1; l <= 10; l++) {
	                System.out.print("*"+" ");
	            }
	            System.out.println();

	        }
	    }

	    }

