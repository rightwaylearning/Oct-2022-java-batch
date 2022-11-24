package Archana_parent_child;

public class Controller {
	public static void main(String[] args) {
		 //case 1 
	Flower f = new Flower();
		f.m1();
		f.m2();
		f.equals(null);
		
	Object o = new Flower();
		o.equals(null);
		
		//case 2
		Rose r = new Rose();
		r.m3();
		r.m1();
		
		r.m2();
		//r.equals(null);
		
	//case 3
		Lily l = new Lily();
        l.m3();
		l.m4();
		// case 4
		 Flower f1 = new Rose();
		 f1.m1();
		 f1.m2();
	}
}	
	



