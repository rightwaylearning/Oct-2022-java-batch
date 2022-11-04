package Vinayak_Landge;

public class CollegeController {

	public static void main(String[] args) {
		
		College c = new College();
		
		c.collegeId = 15455;
		
		c.collegeName = "New Arts College";
		
		c.collegeAdd = "Ahmednagar";
		
		College.university = "Pune university";
		
		c.cm();
		
		College.mm();
		
		System.out.println("-----------------");
		
		c.vv();
		
		College c1 = new College();
		
		c1.collegeId = 1544;
		
		c1.collegeName = "New Law College";
		
		c1.collegeAdd = "Shevgaon";
		
		//College.university = "Pune university";
		c1.vv();
		
		
	}
}
