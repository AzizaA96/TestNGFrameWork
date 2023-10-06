package testNG_day2;

import org.testng.Assert;
import org.testng.Reporter;
import org.testng.annotations.Test;

public class AssertionTesting {

	@Test
	public void test1() {
		Reporter.log("Verifying the title of the page");
		String expectedTitle = "Hello World Dev"; 
		String originalTitle= "Hello World Dev"; 
		
		Assert.assertEquals(originalTitle, expectedTitle, "Titles of the website do not match");
		
	}
	
}
