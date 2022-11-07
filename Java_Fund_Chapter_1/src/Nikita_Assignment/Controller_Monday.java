package Nikita_Assignment;

import rwl_17_10_2022.A;
import rwl_17_10_2022.Student;

public class Controller_Monday {

	public static void main (String[]args) {
		
		A_Monday a = new A_Monday(10,20) ;
		
			int data1 = a.getX();
			System.out.println(data1);
			
			int data2 = a.getY();
			System.out.println(data2);
		System.out.println(">>>>>>>>>>>>>>>>>>>>>>>>>>>>>"); 

	A_Monday a1= new A_Monday();
	a1.setY(100);
	a1.setX(200);
	
    int data3 = a1.getX();
    int data4 = a1.getY(); 
			
		
		System.out.println(data3);
		System.out.println(data4);
	System.out.println(">>>>>>>>>>>>>>>>>>>>>>>>>>");
	
	
	
		Student s = new Student(12,"sudha","ssc");
		s.setName("sudharani");

		System.out.println(s.getName());
		
		Student_Monday s1 = new Student_Monday();
		
		s1.setName("madhura");
		
		
	}
	
}
