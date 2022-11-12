package Vinayak_Landge;

public class EmpArray {
	
	public static void main(String[] args) {
		
		EmpInfo [] e = new EmpInfo[4];
		
							EmpInfo obj = new EmpInfo();
		
							obj.EmpId=25;
							obj.EmpName="Sandesh";
							obj.CName="TCS";
							
		e[0]=obj;
							EmpInfo obj1 = new EmpInfo();
		
							obj1.EmpId=28;
							obj1.EmpName="Manish";
							obj1.CName="Tech M";
							
		e[1]=obj1;
		
							EmpInfo obj2 = new EmpInfo();
		
							obj2.EmpId=29;
							obj2.EmpName="Adesh";
							obj2.CName="TCS";
		
		e[2]=obj2;
		
							EmpInfo obj3 = new EmpInfo();
		
							obj3.EmpId=30;
							obj3.EmpName="Somesh";
							obj3.CName="WIPRO";
							
		e[3]=obj3;
			
		for(int i=0;i<e.length;i++) {
			
			System.out.println(e[i].EmpId);
			System.out.println(e[i].EmpName);
			System.out.println(e[i].CName);
			
			System.out.println("----------");
			
		}
		
		
//		System.out.println(e[0].EmpId);
//		System.out.println(e[0].EmpName);
//		System.out.println(e[0].CName);
//		System.out.println(e[1].EmpId);
//		System.out.println(e[1].EmpName);
//		System.out.println(e[1].CName);
//		System.out.println(e[2].EmpId);
//		System.out.println(e[2].EmpName);
//		System.out.println(e[2].CName);
//		System.out.println(e[3].EmpId);
//		System.out.println(e[3].EmpName);
//		System.out.println(e[3].CName);
	
	}

}
