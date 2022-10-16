package Rutuja.Nimbhore;

public class ThisDemo {
 public static void main(String[] args) {
	Q obj1 =new Q();
	obj1.a=10;
	obj1.b=20;
	obj1.x=30;
	
	obj1.m1(1,2,obj1);
	
	System.out.println("--------------");
	
	Q obj2= new Q();
	obj2.a=100;
	obj2.b=200;
	obj2.x=300;
	 obj2.m1(4, 5, obj2);
}
}
