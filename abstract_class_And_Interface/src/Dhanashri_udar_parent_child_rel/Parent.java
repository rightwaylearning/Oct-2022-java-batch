package Dhanashri_udar_parent_child_rel;

public class Parent {
	void m1() {
		System.out.println("I am m1 method of parent class");
	}
	void m2() {
		System.out.println("I am m2 method of parent class");
	}
	public boolean equals(Object obj){
		System.out.println("I am equal method of parent class");
		return super.equals(obj);
	}
}
class parent1 extends Parent {
	void m2() {
		System.out.println("I am m2 method of parent1 class");
	}
	void m3() {
		System.out.println("I am m3 method of parent1 class");
	}
}
class parent2 extends parent1 {
	void m2() {
		System.out.println("I am m2 method of parent2 class");
	}
	void m3() {
		System.out.println("I am m3 method of parent2 class");
	}
}
class child extends parent2{
	void m3() {
		System.out.println("I am m3 method of child class");	
	}
	void m4() {
		System.out.println("I am m4 method of child class");
	}
}

