package nikita_tonde;

public class ShowUp {
	void PrintData(Bike b) {
		
		System.out.println(b.color);
	
		
		System.out.println(b.price);
		System.out.println("...........................");
		
		
		for(int i = 0; i<b.comp.length;i++) {
			
			
			System.out.println(b.comp [i].BrandName);
		
			System.out.println(b.comp [i].TotalSales);
			System.out.println("........................");
			
			
			
			
		}
		
		
		
		
		
		
	}

}
