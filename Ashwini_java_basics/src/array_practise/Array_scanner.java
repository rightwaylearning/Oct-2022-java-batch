package array_practise;

import java.util.Scanner;

public class Array_scanner {

	public static void main(String[] args) {
		
		
		int n;
		Scanner sc=new Scanner(System.in);
		System.out.println("Eter size of array");
		n=sc.nextInt();
		
		int[] array =new int[n];
		System.out.println("Enter the elements of array");
		
		for(int i=0;i<n;i++) {
			
			array[i]=sc.nextInt();
			
		}
		System.out.println("Array elements are:");
		for(int i=0;i<n;i++) {
			
			System.out.println(array[i]);
			
		}
		
		
	}
	
	
}
