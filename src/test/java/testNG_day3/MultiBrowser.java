package testNG_day3;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.testng.Assert;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class MultiBrowser {

	public WebDriver driver;
@Parameters ("browser")
	@BeforeClass
	public void setUp(String browser) {
		if(browser.equalsIgnoreCase("chrome")){
			WebDriverManager.chromedriver().setup();
			driver = new ChromeDriver();
		}else if (browser.equalsIgnoreCase("edge")){
			WebDriverManager.edgedriver().setup();
			driver = new EdgeDriver(); 
		}

		driver.get("https://www.amazon.com");
		driver.manage().window().maximize();

	}

	@Test
	public void searchItem() {
		WebElement searchBar = driver.findElement(By.xpath("//input[@id='twotabsearchtextbox']"));
		searchBar.sendKeys("90 degree elbow");
		WebElement searchButton = driver.findElement(By.xpath("//input[@value='Go']"));
		searchButton.click();
		WebElement textDisplayed = driver.findElement(By.xpath("//span[@class='nav-sprite nav-logo-base']"));
		Assert.assertTrue(textDisplayed.isDisplayed(), "Result isnt Displayed");// this is checking to see if the amazon text is displayed 
	}
	//@AfterClass
//	public void afterTest() {
		//
	}

