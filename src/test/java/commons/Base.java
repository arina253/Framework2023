package commons;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;

public class Base {
	
   public static WebDriver driver = null;
	
	
	@BeforeMethod
	public void setUp() {
		System.setProperty("webdriver.chrome.driver","C:\\Users\\joshi\\Downloads\\chromedriver-win64\\chromedriver\\chromedriver.exe");
		      driver = new ChromeDriver();
		      driver.get("https://www.saucedemo.com/");
	}
	
	@AfterMethod
	public void tearDown() {
		driver.quit();
	}
	

}
	



