package archana_array;

import java.util.Scanner;

public class array_scanner {

	public static void main(String[] args) {
		
        Scanner s = new Scanner(System.in);
		
		int[]arr = new int[5];
		
		for(int i = 0;i<arr.length; i++) {
			System.out.println("Insert next element");
			arr[i] = s.nextInt();
		}
		

	}

	}

