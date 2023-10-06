package testNG_day1;

import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;
import org.testng.annotations.AfterSuite;
public class runingTestSample {
	
@Test(groups = {"regression","smoke"})
public void test1() {
	System.out.println("Test");
	
}
@Test(groups = {"regression","loadtesting"})
public void test2() {
	System.out.println("Test2");
}
@BeforeMethod
public void beforeMthod() {
	System.out.println("before method");
	
}
@AfterMethod
public void afterMethod() {
	System.out.println("After Method");
}
@BeforeClass
public void beforeClass() {
	System.out.println("before class");
}
@AfterClass
public void afterClass() {
	System.out.println("After class");
}
@BeforeTest
public void beforeTese() {
	// group of many classes == one test 
	System.out.println("before Test");
}
@AfterTest 
public void afterTest() {
	System.out.println("After Test");
}
@BeforeSuite
public void beforeSuite() {
	System.out.println("before suite");
}
@AfterSuite
public void AfterSuite() {
	System.out.println("before suite");

}
}
