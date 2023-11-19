package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import commons.Base;

public class Login extends Base {
	
	//Page Object Model without using Page Factory
	
	//WebElements

	By usernameField = By.id("user-name");
	By passwordField = By.id("password");
	By loginField = By.id("login-button");
	By errorState = By.tagName("h3");
	By logo = By.className("app_logo");
	
	//Constructor
	
	public Login(WebDriver driver) {
		this.driver = driver;
		}
	
	//Methods
	
	public void loginInto(String un,String pwd) {
		driver.findElement(usernameField).sendKeys(un);
		driver.findElement(passwordField).sendKeys(pwd);
		driver.findElement(loginField).click();
	}
	
	public boolean verifyLogo() {
		return driver.findElement(logo).isDisplayed();
	}
	
	public boolean verifyErrorMessage() {
		return driver.findElement(errorState).isDisplayed();
	}
}
