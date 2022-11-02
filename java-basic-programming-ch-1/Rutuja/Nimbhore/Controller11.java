package Rutuja.Nimbhore;

public class Controller11 {
	public static void main(String[] args) {
		Student6 s=new Student6(20,"rahul","ssc");
		s.setName("karishma");
		System.out.println(s.getName());
		System.out.println(s.getRollNumber());
		System.out.println(s.getStd());
		
		//---------------------------------------------------
		System.out.println("=================================");
		//--------------------------------------------------- 
		
		Student6 s1=new Student6();
		s1.setRollNumber(30);
		s1.setName("tushar");
		s1.setStd("hssc");
	
		int data1=s1.getRollNumber();
		String data2=s1.getName();
		String data3=s1.getStd();
		
		System.out.println(data1);
		System.out.println(data2);
		System.out.println(data3);
		
	}

}
