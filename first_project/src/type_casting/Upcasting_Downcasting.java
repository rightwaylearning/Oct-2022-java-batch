package type_casting;

public class Upcasting_Downcasting {

	
	public static void main(String[] args) {
		
		//Up casting
		byte b =15;
		int i=b;
		System.out.println(i);
		
		byte b1=23;
		short i1=b1;
		System.out.println(i1);
		
	   char cc='S';
	   int i3=cc;
	   System.out.println(i3);
	   
	   int i4=67869;
	   long l=i4;
	   System.out.println(l);
	   
	   int i5=43764;
	   float f=i5;
	   System.out.println(f);
	   
	   long l1=765874568L;
	   double d=l1;
	   System.out.println(d);
	   
	   //downcasting
	   
	   char dd='w';
	   short s=(short)dd;
	   System.out.println(s);
	   
	   char ee='}';
	   byte b2=(byte)ee;
	   System.out.println(b2);
	   
	   int i7=125;
	   char rr=(char)i7;
	  System.out.println(rr);
	   
	   /* long do not accept values after decimal point hence data loss happens
	   while converting from float to double.*/
	   float f3=21212.4523F;
	   long l2=(long)f3;
	   System.out.println(l2);
	   
	   
	   //Unpredictable Result
	   long l3=76573344535478L;
	   int i6=(int)l3;
	   System.out.println(i6);
	 
	   //Data Loss
	   double d1=4535565.453534534;
	   float f1=(float)d1;
	   System.out.println(f1);
	   
	   
	   //int arr[]
	   
		
		
	}
}
