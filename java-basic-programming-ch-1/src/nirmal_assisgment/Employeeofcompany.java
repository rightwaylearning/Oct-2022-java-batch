package nirmal_assisgment;

public class Employeeofcompany {
	
	String fname;
	String lname;
	int id;

	public static void main(String[] args) {
		
		
		Employeeofcompany[] e = new Employeeofcompany[3];
		
		               Employeeofcompany c = new Employeeofcompany();
		           
		                        c.fname = "nirmal";
		                        c.lname = "rajput";
		                        c.id = 12;
		        e[0] = c;      
		
		               Employeeofcompany d = new Employeeofcompany();
		     		           
		                        d.fname = "vishva";
		                        d.lname = "rajput";
		                        d.id = 13;
		              
		        e[1] = d;
		        
		                Employeeofcompany f = new Employeeofcompany();
			     		           
		                        f.fname = "kuldip";
		                        f.lname = "rajput";
		                        f.id = 14;
		              
		        e[2] = f;
		       

                               System.out.println(e[0].fname);
                               System.out.println(e[0].lname);
                               System.out.println(e[0].id);
                               
                               
                               System.out.println(">>>>>>>>>>>>>>>>>>>>");
                               
                               
                               System.out.println(e[1].fname);
                               System.out.println(e[1].lname);
                               System.out.println(e[1].id);
                               
                               System.out.println(">>>>>>>>>>>>>>>>>>>>");
                               
                               System.out.println(e[2].fname);
                               System.out.println(e[2].lname);
                               System.out.println(e[2].id);
	}

}
