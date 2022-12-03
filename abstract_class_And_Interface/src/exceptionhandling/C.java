package exceptionhandling;

import java.io.File;

public class C {

	public void doC() throws Exception {
		File f = new File("resume.pdf");
		f.createNewFile();
		System.out.println("I am C class");
  }
}
