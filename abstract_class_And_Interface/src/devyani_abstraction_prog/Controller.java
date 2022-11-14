package devyani_abstraction_prog;

public class Controller {
	public static void main(String []args) {
		MenuCard m= new MenuCardImp();
		
		Customer c=new Customer();
		c.order(m);
		
	}

}
