package abstract_practice;

abstract class stud {
	
	String f_name;
	String s_name;
	int roll_no;
	
	abstract void getStudinfo(String f_name,String s_name,int roll_no);

}

class disp extends stud{
	
	String f_name="Rohit";
	
	String s_name="Shetty";
	
	int roll_no=12;
	
	void getStudinfo(String f_name,String s_name,int roll_no) {
		
		System.out.println(f_name);
		
		System.out.println(s_name);

		System.out.println(roll_no);

	}
}
