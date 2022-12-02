package method1.overriding.pack;


class A{}
class B extends A{}
class C1 extends B{}

 class SouthGate{
	
	 SouthGate(){}
	 
	  B keyEntryPoint(int a) {
		  System.out.println("SouthGate");
		  return null;
	  }
}

 class NorthGate extends SouthGate{
	 
	 NorthGate(){}
    
	 @Override
	 C1 keyEntryPoint(int x) {
		 System.out.println("NorthGate");
		 return null;
	 }
}





public class EntryPoint {

	public static void main(String[] args) {
	
	}
}
