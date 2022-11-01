package practice_array;

public class controller {

	public static void main(String[] args) {
		
		Company c = new Company();
		c.name = "infosys";
		c.numofemp = 2000000;
		   
		     
		                                       Cgrad[] e = new  Cgrad[3];
		                                         Cgrad r = new  Cgrad();
		                                         r.name = "infosys";
		                                         r.grad = 15;
		                            e[0] = r;
		                                         Cgrad r1 = new  Cgrad();
		                                         r1.name = "tcs";
		                                         r1.grad = 20;
		                            e[1] = r1;
		                                         Cgrad r2 = new  Cgrad();
		                                         r2.name = "techmahindra";
		                                         r2.grad = 12;
		                                         
		                             e[2] = r2;
		                             
	c.g = e;  
	
	showup show = new showup();
	show.printData(c);                     
		                             
		                             
		                             
		                             
		                             
		                             
		                             
		                             
	}

}
