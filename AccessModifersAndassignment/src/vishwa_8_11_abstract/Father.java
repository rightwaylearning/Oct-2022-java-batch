package vishwa_8_11_abstract;

public abstract class Father {

	String homeName;
	String where;
	long expect;

	abstract void getFuture(String homeName, int plotNumber);

}

class Son extends Father {
    
	String homeName = "VISHWAPREM";
	String where = "village";
	long expect = 1500000l;

	void getFuture(String homeName, int plotNumber) {
		System.out.println(homeName);
		System.out.println(plotNumber);

	}
// 
}