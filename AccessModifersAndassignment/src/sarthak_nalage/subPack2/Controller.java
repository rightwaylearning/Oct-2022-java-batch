package sarthak_nalage.subPack2;

import sarthak_nalage.subPack1.Test1;
//import sarthak_nalage.subPack1.Controller;
//import sarthak_nalage.subPack2.Test;
import sarthak_nalage.subPack1.Test;

 public class Controller {
	public void c2(String name) {
		System.out.println("welcome " + name);
	}

	public static void main(String[] args) {

		System.out.println("Trying to call methods inside subPack1");
		Test1 t1 = new Test1();
		Test t2 = new Test();// Here, Test class belongs to the subPack1
		t2.t2();
		// suppose we wan't to be cl method from the Test class of subPack2
		sarthak_nalage.subPack2.Test t3 = new sarthak_nalage.subPack2.Test();
		t3.t4();

		// t1.t1(); C.E bcz of method define it's not public in case
		t1.t1();// Now it's public so easily it's accessible
		sarthak_nalage.subPack1.Controller c1 = new sarthak_nalage.subPack1.Controller();
		c1.c1("Sarthak");// Hello Sarthak
		Controller c2 = new Controller();
		c2.c2("Sarthak");// welcome Sarthak
		System.out.println("Calling static method of Controller from subPack1");
		sarthak_nalage.subPack1.Controller.main(null);

	}
}
