package sarthak_nalage;

import java.util.Scanner;

class Printresult
{
	void resultout(int re) {
		System.out.println("Result is "+re);
	}
}

class Performoperation
{	Printresult pr=new Printresult();
	void operation(int n1,int n2) {
		System.out.println("Addition of two number namely "+n1+" "+n2 +" is");
		pr.resultout((n1+n2));
	}
}

class Calcii
{	Performoperation pr=new Performoperation();
	void perform_add(int n1,int n2) {
		pr.operation(n1, n2);
	}
}
public class Subs_Mult_Inheritance {
	public static void main(String[] args) {
		Calcii cl=new Calcii();
		System.out.println("Enter your Number to perform Addition ");
		int n1,n2;
		n1=new Scanner(System.in).nextInt();
		n2=new Scanner(System.in).nextInt();
		cl.perform_add(n1, n2);
	}

}
