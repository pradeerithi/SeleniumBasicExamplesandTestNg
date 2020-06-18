package testNg;

import org.testng.annotations.Optional;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class ParameterizationExamples {

	
	@Test
	@Parameters("Name")
		
	public void printname( String name) {
		System.out.println("Name is "+ name);
	}
	
//	// to print the optional one	
//	public void printname(@Optional("Rithvik Mithran") String name) {
//		System.out.println("Name is "+ name);
//	}
	
}
