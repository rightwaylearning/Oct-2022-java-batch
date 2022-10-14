package sarthak_nalage;
import java.util.*;

public class PyramidPattern {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the level of pyramid");
		int lev=sc.nextInt();
		for(int i=1;i<=lev;i++) {
			for(int j=lev;j>i;j--) {
				System.out.print(" ");
			}
			for(int k=1;k<=i;k++) {
				System.out.print("*"+" ");
			}
			
            System.out.println();
        }
			
		}
	}


