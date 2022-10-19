package nirmal_set_get;

public class scontroller {

	public static void main(String[] args) {

		Student s = new Student("nirmal", "Rajput", 56);
//		s.setFirstname("Nirmal");
//		s.setLastname("rajput");
//		s.setRollnumber(56);

		String m = s.getFirstname();
		String n = s.getLastname();
		int o = s.getRollnumber();

		System.out.println(m);
		System.out.println(n);
		System.out.println(o);
	}

}
