package Dhanu_method_overriding;
import method1.overriding.pack.Parent;

public class controller {
	
public static void main(String[] args) {
		
		Parent p = new Parent();
		p.m1(10); // 100
		p.m1(5); // 25
		
		Child c= new Child();
		c.m1(100);
		
		Parent p1 = new Child();
		p1.m1(10);;
		
	
	}
}

