package Nikita_parent_child;

public class Controller {
public static void main(String[] args) {
	Parent p = new Parent();
	
	p.m1();
	p.m2();
	p.getClass();
	System.out.println("............................................");
	
	Child c = new Child();
	c.m1();
	c.m2();
	c.m3();
	System.out.println("........................................");
	
	Parent p1 = new Child ();
	p1.m1();
	p1.m2();
	
	
	
	
}
}
