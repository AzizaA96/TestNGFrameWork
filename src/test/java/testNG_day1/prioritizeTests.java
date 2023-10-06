package testNG_day1;

import org.testng.annotations.Test;

public class prioritizeTests {

	
	
	@Test(priority=001, groups="loadTesting")
	public void loginWithValidUsernameValidPassword() {
		System.out.println("loginWithValidUsernameValidPassword");
		
		
		
	}
	
	@Test(priority=2,groups="regression")
	public void loginWithValidUsernameInvalidPasword() {
	System.out.println("loginWithValidUsernameInvalidPasword");
	

	}
	@Test(priority=222, groups={"smoke", "loadTesting"})
	public void loginWithIValidUsernameInvalidPasword() {
		System.out.println("loginWithIValidUsernameInvalidPasword");
}
	@Test(priority=4, groups="regression")
	public void loginWithInvalidEmailFormat() {
		System.out.println("loginWithInvalidEmailFormat");
	}
}