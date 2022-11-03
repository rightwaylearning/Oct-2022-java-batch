package sarthak_nalage;

public class IncreeAndDecee {
	public static void main(String[] args) {
		byte a=10;
		a=(byte)(a+1);//explicitly define
		byte b=++a;//a=a+1 done firstly and then rest of execution is done in case of preIncrement
		System.out.println(b);
		int c=a++ + b++;
		 c=a+b;
		System.out.println(c);
		float f1=45.45F;
		f1++;
		System.out.println(f1);
		
	/* a++ is implicitly similar to casting and it's rules i.e a=a+1; is equal to a=(byte)(a+1) In case
	you want to define explicitly then you must define its casting protocol, else In case of Implicitly 
	compiler will manage it
*/	
		}
	
}
