package Rutuja_Kauthale.Operator_Folder;

public class ArithmeticOperator {

	public static void main(String[] args) {
		int a=10;
		int b=20;
		
		int result;
		
		result= a+b; 
		System.out.println("Addition of "+a+" and "+b+"is "+result);
		
		result =b-a;
		System.out.println("Substraction of "+b+" and "+a+"is "+result);
		
		result =b*a;
		System.out.println("Multiplication of "+b+" and "+a+"is "+result);
		
		result =b/a;
		System.out.println("Division of "+b+" and "+a+"is "+result);
		
		result =b%a;
		System.out.println("Modulus of "+b+" and "+a+"is "+result);
		
		int a1=30;
		long b1=40;
		
	//	int r1=a1+b1 //it showing error why 
		/*  here jvm use rule- in which datatype result of 
		 * Arithmetic operation store that is 
		 * max(int, DatatypeofOperant1, datatypeofOperant2) first int is default provide by JVM
		 * for the above equation max(int.int,long) whose it the greatest datatype. i.e Long hence
		 * we need to store the data in Long datatype */
		long r1=a1+b1;
		System.out.println("result is "+r1);
		
		
		//Example no 2
		float f=12.50f;
		double d=34.65;
		double r2=d-f;   // max(int,float,double)-----> double
		System.out.println(r2);
		
		
		
		byte b3=15;
		byte b4=10;
		
//yte result1 =b3+b4;// here JVM treat result as a int.
		byte result1 =(byte) (b3+b4);// here we downcast and forcing store the data in byte.
		System.out.println(result1);
		
		

	}
}
