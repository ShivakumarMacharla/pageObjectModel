package pages;


import java.time.Duration;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;

public class BaseTest {

	protected static WebDriver driver ;
	public static Logger log;
	
	@BeforeClass
	public void launchBrowser() {
		
		log = LogManager.getLogger(BaseTest.class);
		
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(3000));
		driver.get("https://easycom.quickeselling.com/signup.html");
		//driver.get("https://easycom.quickeselling.com/");
		log.info("------launchBrowser------");
	}
	@AfterClass
	public void tearDown() {
		log = LogManager.getLogger(BaseTest.class);
		driver.close();
	}
	
	public static void explicitWait(int time, By element) {
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(time));
		wait.until(ExpectedConditions.visibilityOfElementLocated(element)).click();
	}
}
