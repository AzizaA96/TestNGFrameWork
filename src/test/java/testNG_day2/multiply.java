package testNG_day2;

import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class multiply {

	@Test
	@Parameters({"val1","val2",})
	public void multiply (int value1, int value2) {
		int total= value1 * value2; 
		System.out.println("The total of the given value is " + total);
	}
}
