package Rutuja_Kauthale.Operator_Folder;



public class EqualityOperator {

	public static void main(String[] args) {
		System.out.println("Equality operator  ==  , !=  ");
		
		int a=10;
		long b=30;
		
		boolean c;
		c= a==b;
		System.out.println(c);  //false
		
		
		c=a!=b;
		System.out.println(c);//true
		
		c= true == true;
		System.out.println(c); //true
		
		//c= false != 10;  it will not allow  
		
		
		c= 45.00 == 45.f;
		System.out.println(c); //true
		
		//c= 10== 10 != 30;// fALSE  10== 10 is true, then true!=30 is not allow 
		//it will gives you compiler time error.
		
		// we can compare between all number and char to each other. but we can't compared boolean and number type
		
		
	}
}
