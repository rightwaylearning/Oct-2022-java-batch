import java.util.*;
import java.io.*;

class Demo{

public static void main(String[] args)
{

Demo1 obj =new Demo1();

System.out.println(obj.a);
System.out.println(obj.b);

obj.m1(200,300);
System.out.println(obj.a);
System.out.println(obj.b);

PrintStream p=new PrintStream(System.out);
p.println("Good Morning");

}
}

class Demo1{
int a,b;

Demo1(){}

	Demo1(int x,int y)
	{
	a=x;
	b=y;
	}
	void m1(int x, int y)
	{
	a=x;
	b=y;
	}


}