package commons;

import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

public class Utility extends Base {
	
	
	//for verifying title
	public boolean verifyTitle(String expectedTitle) {
		String actualTitle = driver.getTitle();
		return actualTitle.equals(expectedTitle);
		}
	
	
	//for opening Url
	public void openUrl() {
		driver.getCurrentUrl();
	}
	
	//for taking screenshot
	public void captureScreenshots() {
		TakesScreenshot screenshot = (TakesScreenshot)driver;
		File source = screenshot.getScreenshotAs(OutputType.FILE);
		String path = "C:\\Users\\joshi\\eclipse-workspace\\Framework\\src\\test\\java\\commons\\img2.png";
		File destination = new File(path);
		
		try {
			FileUtils.copyFile(source, new File(path));
		}
		catch(IOException e) {
			e.printStackTrace();
		}
	}
		
	//for selecting dropdown with locators
	public void selectByIndex(WebDriver driver,WebElement dropDown,int optionToselect) {
			Select select = new Select(dropDown);
			select.selectByIndex(optionToselect);
		}
		
	public void selectByVisibleText(WebDriver driver,WebElement dropdown,String optionsToselect) {
		Select select = new Select(dropdown);
		select.selectByVisibleText(optionsToselect);
	}
	
	public void selectByValue(WebDriver driver,WebElement dropdown,String optionsToselect) {
		Select select = new Select(dropdown);
		select.selectByValue(optionsToselect);
	}

}
	
	


