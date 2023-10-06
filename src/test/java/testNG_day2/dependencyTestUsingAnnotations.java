package testNG_day2;

import org.testng.Assert;
import org.testng.annotations.Test;

public class dependencyTestUsingAnnotations extends groupingTests {

	
	@Test(dependsOnMethods={"environmentTest"})
	public void testPrintMessage() {
		System.out.println("inside testPrintMessage");
	}
	
	@Test(dependsOnMethods = "anotherBoringMethod")
	public void environmentTest() {
		System.out.println("Testing environment");
		Assert.assertTrue(false);
	}
	
	
	
}
