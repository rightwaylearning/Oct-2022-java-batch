package rwl_17_10_2022;

public class Controller {

	public static void main(String[] args) {


		A a= new A(10,20);
		
		int data1 = a.getX();
		System.out.println(data1);
		
		int data2 = a.getY();
		System.out.println(data2);
		
		// -------------------------------------------------
		
		A a1= new A();
		a1.setY(100);
		a1.setX(200);
		
	    int data3 = a1.getX();
	    int data4 = a1.getY();
	    
	    System.out.println(data3); // 100
		System.out.println(data4); // 200
		
		//--------------------------------------------------
		
		Student s = new Student(12,"sudha","ssc");
		s.setName("sudharani");

		System.out.println(s.getName());
		
		Student s1 = new Student();
		
		s1.setName("madhura");
		
			
	}
}
