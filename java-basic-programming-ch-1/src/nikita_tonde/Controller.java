package nikita_tonde;

public class Controller {
	public static void main (String []args) {
		
	
	Bike b  = new Bike();
    b.color = "Blue";
	b.price = 600000;
	 
	                        
	                        company []comp = new company[3];
	                        company c1 = new company ();
	                        c1.BrandName = "Hero Moto Crop";
	                        c1.TotalSales = 2654897;
	                        
	                        comp[0] = c1;
	                        
	                        company c2 = new company ();
	                        c2.BrandName = "Honda";
	                        c2.TotalSales = 45623817;
	                        
	                        comp[1] = c2;
	                        
	                        company c3 = new company ();
	                        c3.BrandName = "Bajaj";
	                        c3.TotalSales = 847561354;
	                        
	                        comp[2] = c3;
	                        
	                        b.comp = comp;
	                        ShowUp Show = new ShowUp ();
	                        Show.PrintData(b);
	                        
	                        
	                        
	                         
	                         
	
	
			

	}
}
