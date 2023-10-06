package testNG_day3;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class ParallelTest {

	public WebDriver driver; 
	
	@Test
	public void ChromeTest() {
		WebDriverManager.chromedriver().setup();
		driver= new ChromeDriver();
		driver.get("https://www.techcircle.dev");
	}
	@Test
	public void edgeTest() {
		WebDriverManager.edgedriver().setup();
		driver= new EdgeDriver();
		driver.get("https://www.techcircle.dev");


		 // thread count means how many tests it can run at the same time, it can run up t
	}
}
