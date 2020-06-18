package testNg;

import org.testng.annotations.Test;

public class DependanciesManagement {
	
	// depends on Method
	
	@Test(enabled = true)
	public void highSchool() {
		System.out.println(" High school");
	}

	@Test(dependsOnMethods = "highSchool")
	public void higherSecondary() {
		System.out.println(" Higher school");
	}

	@Test(dependsOnMethods = "higherSecondary")
	public void engineering() {
		System.out.println(" college");
	}

}
