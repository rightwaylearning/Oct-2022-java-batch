package vishwa_doubts_solver;

public class Factory {

	public  A getObject(){
		
		A c = new B();
		return c;
//		B b = new B();
//		return b;
	}
}


