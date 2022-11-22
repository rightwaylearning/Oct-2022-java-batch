package vaibhavPatil_20_09_2022;

//import vaibhavPatil_20_09_2022.Sum.Minus;

public class Controlller_sum {
public static void main(String[] args) {
		
		Sum s=new Sum();
		s.a=20;
		s.b=10;
		int sum=s.sum();
		System.out.println(sum);
		
	   Minus m=new Minus();
		m.a=15;
		m.b=32;
		int mm=m.minus();
		System.out.println(mm);
		
		 Mul u=new Mul();
			u.a=15;
			u.b=32;
			int tt=u.Multi();
			System.out.println(tt);
		
		
	}
	

}
