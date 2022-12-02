package archana_abstrac_demo;

  abstract public class parent {
	  abstract  void a1();
	  abstract void a2();
	  void a3() {
		  System.out.println("I am a3 method of parent class");
	  }

}
  
   class child extends parent{
		void a1() {
			System.out.println("I am a1 method of child class");
		} 
		
		void a2() {
			System.out.println("I am a2 method of child class");
		}
   }	
