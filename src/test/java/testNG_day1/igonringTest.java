package testNG_day1;

import org.testng.annotations.Ignore;
import org.testng.annotations.Test;

public class igonringTest {

	@Test (enabled=true,groups="smoke")//best way to ignore enabled = true and enabled = false instead of doing //@ignore and @ignore 
	public void test1() {
		System.out.println("Test1");
	}
	@Test(groups="regression")
	public void test2() {
		System.out.println("Test2");
	}
}
