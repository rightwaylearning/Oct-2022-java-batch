package Udar_Dhanashri_14_10;

import rwl_14_10_22.A;

public class Controller {
public static void main(String[] args) {
		
		A a= new A();
		a.m1(100, 200);
	   		
		System.out.println(a.a); // 100
		System.out.println(a.b); // 200
	//-----------------------------------------
		
		A a1= new A(10,20);
		a1.m1(1000, 2000);
		a1.updateA(10000);
		
		System.out.println(a1.a); // 1000
		System.out.println(a1.b); // 2000
	}
}
