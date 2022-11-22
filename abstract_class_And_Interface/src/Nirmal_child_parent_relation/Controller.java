package Nirmal_child_parent_relation;

public class Controller {
	public static void main(String[] args) {
		CafeMenuCard c = new CafeMenuCardIpl();

		Customer customer = new Customer();
		customer.order(c);

	}

}
