package Rushikesh_14_10_2022;

public class OneController {
	
	public static void main(String[] args) {
		
		
		one o=new one();
		o.m1("Ram", 99);
		System.out.println(o.name);
		System.out.println(o.rollNo);
		
		
		one o1=new one("Rushikesh",55);
		
		System.out.println(o1.name);
		System.out.println(o1.rollNo);
		
		
	}

}
