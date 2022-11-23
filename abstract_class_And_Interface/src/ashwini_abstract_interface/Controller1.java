package ashwini_abstract_interface;

public class Controller1 {

	public static void main(String[] args) {
		
		
		/* case 1
		Parent1 parent1=new Parent1();
		parent1.m3();
		parent1.m4();*/
		
		//case 2;
		Child1 child1=new Child1();
		child1.m3();
		child1.m4();
		child1.m5();
		
		Parent1 parent1=new Child1();
		parent1.m3();
		parent1.m4();
		//parent1.m5();          compiler gives error as parent1 reference cant access m5 method of child.
		
		//case 4
		//Child1 child2=new Parent1();
		
		
		
		
		
		
		
	}
}
