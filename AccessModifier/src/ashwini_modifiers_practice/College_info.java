package ashwini_modifiers_practice;

public class College_info {

	String cName;
	int cCode;
	String address;
	int staffCount;

void c_data(String cName, int cCode,String address,College_info obj) {
		System.out.println(cName);
		System.out.println(cCode);
		System.out.println(address);
		//System.out.println(staffCount);
		System.out.println(obj.cName);
		System.out.println(obj.cCode);
		System.out.println(this.cName);
		System.out.println(this.cCode);
		System.out.println(obj.address);
		System.out.println(this.address);
	}
}

