package testNG_day2;

import org.testng.annotations.Test;

public class groupingTests {
	@Test(groups = "smoke")
public void alexTest() {
	System.out.println("alexTest");
	
}
	@Test(groups = "smoke")
public void EverTest() {
	System.out.println("EverTest");
}
	@Test(groups = {"functional, smoke"})
public void shaffyTest() {
	System.out.println("shaffyTest");
}
	@Test(groups = {"functional ","smoke"})
public void GianTest() {
	System.out.println("GianTest");
}
	@Test(groups = "functional")
	public void anotherBoringMethod() {
		System.out.println("anotherBoringMethod");
	}
}
