package getter_setter;

import java.util.Scanner;


		/* array[0]=10;
		array[1]=20;
		array[2]=56;
		array[3]=120;
		array[4]=105;
		array[5]=50;
		array[6]=130;
		array[7]=163;
		array[8]=200;
		array[9]=40;
		*/
      public class array_operation {
	  public static void main(String[] args) {
		int array[]=new int[10];
		Scanner s = new Scanner(System.in);
		array[0] = s.nextInt();
		Scanner s1 = new Scanner(System.in);
		array[1] = s.nextInt();
		Scanner s2 = new Scanner(System.in);
		array[2] = s.nextInt();
		Scanner s3 = new Scanner(System.in);
		array[3] = s.nextInt();
		Scanner s4 = new Scanner(System.in);
		array[4] = s.nextInt();
		Scanner s5 = new Scanner(System.in);
		array[5] = s.nextInt();
		Scanner s6 = new Scanner(System.in);
		array[6] = s.nextInt();
		Scanner s7 = new Scanner(System.in);
		array[7] = s.nextInt();
		Scanner s8 = new Scanner(System.in);
		array[8] = s.nextInt();
		
		for(int i= 0;i<array.length;i++) {
			System.out.print("  " +array[i]);
		}
		System.out.println();
		int sum = array[0]+array[9];
		System.out.println(sum);
		
		int sub = array[1]-array[8];
		System.out.println(sub);
		
		int mult = array[0]*array[1];
		System.out.println(mult);
	
		
	}

}
