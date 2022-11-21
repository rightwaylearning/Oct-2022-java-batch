package vishwa_abstraction;

public class Hcontroller {

	
	public static void main(String[] args) {
		
		HotelMenuCard HM = new HotelMenuCardimpls();
		
		//HM.coldCofee();
		
		
		Customer c = new Customer();
		c.order(HM);
		
		
		
		
		
		
		
	}
	
	
	
	
}
