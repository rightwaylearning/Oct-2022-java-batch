package Rutuja_Kauthale.Operator_Folder;

public class RelationalOperator {
public static void main(String[] args) {
	
	System.out.println("Relational Operator are : <, >, <=, >=");
	
	
boolean result;
	System.out.println("always store result in boolean and operands are not boolean and reference data type");
		//result = true> false;
		 //result= true > 10;    error : The operator > is undefined for the argument type(s) boolean, int
	
	System.out.println(result=10>=10);//true
	result= 23<=30;
	System.out.println(result);//true
	
	result = 'A' >= 65; // always give single cot. 
	
	System.out.println(result);//true
	
	//result= "a" > 72; // here it will take a as a string. it is  in double cot 
	
	
	result = 10<30;
	System.out.println(result); //true
	
	result = -10 > 0; 
	System.out.println(result); //false
	
	//result = 50> 30 >40 ; // show error  50>30 is true, then true>40 
	//its will give error because boolean as a operand not allow.
	
	long a=10;
	int b=10;
	
	result = a>=b;
	System.out.println(result);  //true
	
	double d= 45.00;
	float  f=45.f;
	result = d>f;  
	
	System.out.println(result); //false
	
	result= 'A'>'a';
	System.out.println(result);//false  it compared using ASCII value.
	
}
}
