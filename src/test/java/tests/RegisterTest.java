package tests;

import org.apache.logging.log4j.LogManager;
import org.testng.annotations.Test;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;

import pages.BaseTest;
import pages.RegisterPage;

public class RegisterTest extends BaseTest  {
	
	RegisterPage registerpage;
//	ExtentReports extent;
//	ExtentTest test;	

	@Test
	public void testRegisterAccount() {
		log = LogManager.getLogger(RegisterTest.class);
		//test = extent.createTest("Launch Browser");
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
