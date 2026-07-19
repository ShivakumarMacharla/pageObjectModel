package tests;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.testng.annotations.Test;

import pages.BaseTest;
import pages.LoginPage;

public class LoginTest extends BaseTest{

	LoginPage loginpage;
	
	
	@Test
	public void validateLoginCredentials() {
		log = LogManager.getLogger(LoginTest.class);
		
		log.info("============validateLoginCredentials=======================");
		
		loginpage = new LoginPage(driver);
		
		//log.info("validateLoginCredentials");
		driver.get("https://easycom.quickeselling.com/");
		
		loginpage.clickonLoginButton().click();
		loginpage.enterUsername().sendKeys("macharlashivakumar99@gmail.com");
		loginpage.enterpassword().sendKeys("abcd@1234");
		loginpage.clickonLoginButton().click();
		
	}
}
