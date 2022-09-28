package new_proje;

public class C {public static void main(String[] args) {
	
	A obj = new A();
	obj.a =100;
	obj.b = 200;
	int sum= obj.sum();
	System.out.println(sum);
	
	
     B b = new B();
     A obj1=b.getAObject();
     int r = obj1.sum();
     System.out.println(r);
}

}
