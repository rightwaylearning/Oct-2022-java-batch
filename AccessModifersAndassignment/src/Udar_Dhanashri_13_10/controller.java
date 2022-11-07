package Udar_Dhanashri_13_10;

import rwl_13_10_2022.Test;

public class controller {
	public static void main(String[] args) {
		Test t = new Test();
		System.out.println(t.a);
		System.out.println(t.b);
		
		Test t1 = new Test(100,200);
		System.out.println(t1.a);
		System.out.println(t1.b);
		
		// if there any one constructor in ur class , then compiler is not respossible to add constructor in ur class
		
	}
}

