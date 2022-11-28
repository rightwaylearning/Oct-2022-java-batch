package Archana_abstraction_class;

public class Controller {
	public static void main(String[] args) {
		menuCard m = new menuCardimpl();
		Customer c = new Customer();
		c.order(m);
	}

}
