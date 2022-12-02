package Archana_parent_child;

public class Controller {
	public static void main(String[] args) {
		// case 1
		Parent p = new Parent();
		p.m1();
		p.m2();
		
		System.out.println("..................");
		
		//case 2
		Child c = new Child();
		c.m1();
		c.m2();
		c.m3();
		
		System.out.println(".................");
	// child can hold one method of Parent class
		
		//case 3
		
		Parent p1 = new Child();
		p1.m1();// parent 
		
		p1.m2();//Child
		
		//m2() method is having in both class Parent or class Child but run time jvm call child class method.	

		
		
	}

}
