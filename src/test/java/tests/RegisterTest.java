package tests;

import org.apache.logging.log4j.LogManager;
import org.testng.annotations.Test;

import pages.BaseTest;
import pages.RegisterPage;

public class RegisterTest extends BaseTest  {
	
	RegisterPage registerpage;

	@Test
	public void testRegisterAccount() {
		log = LogManager.getLogger(RegisterTest.class);
		
		log.info("============validateLoginCredentials=======================");
		registerpage = new RegisterPage(driver);
		registerpage.enterFirstName().sendKeys("shiva");
		registerpage.enterLastName().sendKeys("macharla");
		registerpage.enterMobileNumber().sendKeys("9392636336");
		registerpage.enterEmail().sendKeys("macharlashivakumar99@gmail.com");
		registerpage.enterPassword().sendKeys("abcd@1234");
		registerpage.enterConfirmPassword().sendKeys("abcd@1234");
		//registerpage.enterSubmitButton().click();
	}

	
	
}
