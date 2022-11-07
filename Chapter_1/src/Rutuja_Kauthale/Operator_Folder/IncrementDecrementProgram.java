package Rutuja_Kauthale.Operator_Folder;

public class IncrementDecrementProgram {

	public static void main(String[] args) {
		int a=10;
		 int b= ++a; // in this case first a increment his value and then assign.
		System.out.println("a "+a);// 11 
		System.out.println("b "+b); //11
		
		int d=10;
		int c=d++; // in this case first d assigned his value to c and then increment
		System.out.println("d  "+d);//11
		System.out.println("c  "+c);//10
		
	System.out.println("************************************************************");
		//long l=12;
		//--(--l)  it will give error because  the equation become --(11) and decrement and increment will 
		// not work on literal value 
		// it will work only on byte, short, int, long, float, double.
		
		
		double d1= 12.50;
		d1++;
		System.out.println(d1);
		
		
	System.out.println("************************************************************");
		//example 
		
		int m=10;
		int n=20;
		
		int z;
		z= m++ + --n;  // 10 + 19 = 29 
		// m and n become m=11; n=19
		System.out.println(z);  //29
		
		
		z= m++ + ++n;  //11 + 20 = 31
		// m= 12 n=20 
		System.out.println(z); //31
		
		
		z= m-- + ++n; // 12+ 21= 33
		//m=11 n=21
		System.out.println(z); //33
		
	
		
		z=--m + n--; // 10+21= 31
		//m=10 n=20
		
		System.out.println(z);  //31
	System.out.println("************************************************************");	
		
		//Nested increment and decrement not allowed in JAVA
		
		//int P =25;
		//int Q=++(++P); it will show error.
		System.out.println("	//Nested increment and decrement not allowed in JAVA");
		
	System.out.println("************************************************************");	
		
		//on final variable we can't apply increment decrement operator.
		//final int p=20;
	//	++p;
		System.out.println("on final variable we can't apply increment decrement operator");
		
	System.out.println("************************************************************");
		
		
	
	}
	
	
}
