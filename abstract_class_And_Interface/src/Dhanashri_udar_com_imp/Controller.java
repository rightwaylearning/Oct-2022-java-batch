package Dhanashri_udar_com_imp;

public class Controller {
public static void main(String[] args) {
		
		// case 1]
		Parent p=new Parent();
		p.m1();
		p.m2();
		p.getClass();
		System.out.println(">>>>>>>");
		
		// case 2]
		Child c= new Child();
		c.m1();
		c.m2();
		c.m3();
		System.out.println(">>>>>>>>>");
		
//		// case 3]
		
		Parent d= new Child();
		d.m1(); // child
		d.m2(); // parent
	//	d.m3(); 
		
		// case 4]
		
	
//		//Child c1= new Parent();
	}
}

