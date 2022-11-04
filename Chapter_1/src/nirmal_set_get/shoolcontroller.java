package nirmal_set_get;

public class shoolcontroller {

	public static void main(String[] args) {

		School s = new School("dr school", "d n jadhav", 1);

		School.m1();
		s.m2();

		String t = s.getName();
		String l = s.getHeadMaster();
		int q = s.getGrade();

		System.out.println(t);
		System.out.println(l);
		System.out.println(q);

	}

}
