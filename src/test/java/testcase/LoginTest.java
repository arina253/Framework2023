package testcase;

import org.testng.Assert;
import org.testng.annotations.Test;

import commons.Base;
import pages.Login;

public class LoginTest extends Base {
	Login login;
	
	
	@Test
	public void verifyLogin() {
		login = new Login(driver);
		login.loginInto("standard_user", "secret_sauce");
		boolean avail = driver.getCurrentUrl().contains("inventory");
	    Assert.assertTrue(avail);
		
	}
	
	@Test
	public void verifyLogo() {
		 login = new Login(driver);
		 login.loginInto("standard_user", "secret_sauce");
		 boolean avail2 = login.verifyLogo();
		 Assert.assertTrue(avail2);
	}
	
	@Test
	public void invalidlogin() {
		login = new Login(driver);
		login.loginInto("sauce","1234");
		login.verifyErrorMessage();
	}
	
	@Test
	public void invalidUsername() {
		login = new Login(driver);
		login.loginInto("locked_out_user","secret_sauce");
		boolean avail3 = login.verifyErrorMessage();
		Assert.assertTrue(avail3);
	}
	
	@Test
	public void invalidPassword() {
		login = new Login(driver);
		login.loginInto("standard_user", "sauce");
		boolean avail4 = login.verifyErrorMessage();
		Assert.assertTrue(avail4);
		
		
	}
	
	

}
