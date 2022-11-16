package abstract_practice;

public class studInfo {
	
	public static void main(String[] args) {
		
		disp d = new disp();
		
		System.out.println(d.f_name);
		
		System.out.println(d.s_name);
		
		System.out.println(d.roll_no);
		
		d.getStudinfo("sandip", "shinde", 41);
		
	}

}
