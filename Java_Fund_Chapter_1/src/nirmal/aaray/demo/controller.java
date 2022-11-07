package nirmal.aaray.demo;

public class controller {

	public static void main(String[] args) {
		
		Newemployeestorag b1 = new Newemployeestorag();
		b1.firstname = "nirmal";
		b1.lastname = "rajput";
		b1.mailid = "nirmal346@gmail.com";
		b1.mob = 74748883;
		
		Newemployeestorag b2 = new Newemployeestorag();
		b2.firstname = "vishva";
		b2.lastname = "girase";
		b2.mailid = "vishva346@gmail.com";
		b2.mob = 74748887;
				
		Newemployeestorag[] add = {b1,b2};
		
		for(int i = 0; i <= add.length; i++) {
			System.out.println(add[i].firstname);
			System.out.println(add[i].lastname);
			System.out.println(add[i].mailid);
			System.out.println(add[i].mob);
			
			
			
		}
		
}

}	

