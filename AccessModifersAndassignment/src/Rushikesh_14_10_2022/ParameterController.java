package Rushikesh_14_10_2022;

public class ParameterController {
	
	 public static void main(String[] args) {
		
		 
		 
		 Parameter p= new Parameter(); // Default Constructor
		 p.m1(30,90);                             //By the use of void method i can re-initialize value.
		 System.out.println(p.a);
		 System.out.println(p.b);
		 
		 
		 
		 
		 
		 
		 Parameter p1= new Parameter(10,50); // Parameterized Constructor
		 p1.m1(70, 80);                           //By the use of void method i can re-initialize value.
		 System.out.println(p1.a);
		 System.out.println(p1.b);
		 
	}
	 

}
