package vaishnavi.shitole;

public class Array_Example {
	public static void main(String[] args) {
		
	
	Student s = new Student();
	   s.name="Vaishu";
	   s.div='A';
	   s.rollNo=04;
	   
	   						Marks[] m = new Marks[5];
	   						Marks n1 = new Marks();
	   					
	   						n1.subject="Maths";
	   						n1.score=81;
	   						
	   			m[0]=n1;	
	
	   						Marks n2 = new Marks();
	   						
	   						n2.subject="OS";
	   						n2.score=85;
	   						
	   			m[1]=n2;
	   			
	   System.out.println("Name = "+s.name);
	   System.out.println(s.div);
	   System.out.println(s.rollNo);
	   System.out.println(m[0].score);
	   System.out.println(m[0].subject);
	   System.out.println(m[1].score);
	   System.out.println(m[1].subject);
	
	
	
//	int[] a = new int[5];
//	a[0]=10;
//	a[1]=20;
//	a[2]=30;
//	a[3]=40;
//	a[4]=50;
//	//a[5]=60;
//	System.out.println(a[0]);
//	System.out.println(a[1]);
//	System.out.println(a[5]);
//	
	}
}
