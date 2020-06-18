package testNg;

import org.testng.Assert;
import org.testng.annotations.Test;

public class AssertionsExample {
	String name ="Rithvik";
	@Test
	public void assertEg(){
		Assert.assertEquals(name, "Rithvik");
	}
	
}
