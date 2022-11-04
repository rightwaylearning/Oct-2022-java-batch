package Rutuja.Nimbhore;

public class Controller10 {
 public static void main(String[] args) {
	C c=new C(10,20);
	int data1=c.getx();
	System.out.println(data1);
	int data2=c.gety();
	System.out.println(data2);
	
	
	//-------------------------------
	
	C c1=new C();
	 c1.setx(100);
	 c1.sety(200);
	 
	 int data3=c1.getx();
	 System.out.println(data3);
	 
	 int data4=c1.gety();
	 System.out.println(data4);
	 
	 

}
}
