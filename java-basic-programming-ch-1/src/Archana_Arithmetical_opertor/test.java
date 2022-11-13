package Archana_Arithmetical_opertor;

public class test {
	public static void main(String[] args) {
		int a = 20;
		int a1 = 10;
		++a1;
		a++;
		System.out.println(a);//21
		System.out.println(a1);//11
		
		char ch = 'A';
		ch = (char)(ch+1);//type casting
		
		System.out.println(ch);//B
		
		
		int i = 19;
		int i1 = 2;
		int r = i/i1;
		System.out.println(r);//9
		
		
		int x =10;
		int y =x++;
		System.out.println(x);//11
		System.out.println(y);//10
		
		int a2 =25;
		int b = a++;
		System.out.println(a2);
		System.out.println(b);
		
		int a3 = 10;
		int b1 = --a3;
		System.out.println(b1);
		
		int a4 = 25;
		int s = a4--;//25
		System.out.println(s);
		
		int p =11;
		int t = 4+(--p);
		System.out.println(t);//14
		
		int d =5;
		int e= ++d;
		System.out.println(e);//6
		
	}

}
