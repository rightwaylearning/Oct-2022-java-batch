package ArchanaAccessModifer;

public class Controller {

	public static void main(String[] args) {
		Fruit f = new Fruit();
		f.m1();
		f.getClass();
		System.out.println("================");
		
		Apple a = new Apple();
		a.Season();
		a.Season1();
		System.out.println("=================");
		
		Banana b = new Banana();
		b.Season();
		System.out.println("==================");
		
		Grapes g = new Grapes();
		g.Season();
		System.out.println("=================");
		
		
		Banana b1 = new Grapes(); 

	}

}
