package operators_08_11_2022;

public class Operator_Practice {
	
	public static void main(String[] args) {
		//Arithmetic opt
		int a=34,b=67;
		int sum=a+b;
		System.out.println(sum);    //101
		
		//pre-increment, decrement
		int x=25;
		x=++x;
		System.out.println(x); //26
		
		int y=50;
		int z=--y;            //opt with different operands i.e. binary
		System.out.println(z);   //49
		
		//post-increment, decrement
		int m=60;
		m=m++;
		System.out.println(m);   //60
		int n=70;
		n=n--;
		System.out.println(n);   //70
		
		//short-hand opt
		y+=x;     //y=y+x
		System.out.println(y);   //75
		y-=x;      //y=y-x
		System.out.println(y);   //25
		
		//typecasting with post-increment
		char ch = 'A';
		ch=(char)(ch++);
				System.out.println(ch);  //65//A
				System.out.println(10==11);  //false
				System.out.println(15>10);   //true
				System.out.println(55<45);   //false
				System.out.println('A'!=65);  //false
				System.out.println(65.2!=65);  //true
				System.out.println(46>=46);   //true

				int p=41,q=52;
				System.out.println(p&q); //32
				System.out.println(p^q);  //29
				
				if(p<=41 && q==52) {
					System.out.println("true");}   //true
					else {System.out.println("false");}
				//ternary pot
				int a1=78, a2=97;
				int x1=(a1>a2)?a1:a2;
				System.out.println(x1);
		
	}

}
