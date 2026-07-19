package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class LoginPage {

	WebDriver driver;
	// constructor
	public LoginPage(WebDriver driver) {
		this.driver = driver;
	}
	//locators
	private By loginIcon = By.xpath("//button/i[@class='icon-f-94']");
	private By Username = By.xpath("//input[@id='email' and @placeholder='Enter Username or E-mail']");
	private By Password = By.xpath("//input[@id='password' and @placeholder='Enter Password']");
	private By loginButton = By.xpath("//input[@id='login']");
	
	//action methods
	public void clickOnLoginIcon() {
		WebElement ele = driver.findElement(loginIcon);
		ele.click();
	}
	public WebElement enterUsername() {
		return driver.findElement(Username);
	}
	public WebElement enterpassword() {
		return driver.findElement(Password);
	}
	public WebElement clickonLoginButton() {
		return driver.findElement(loginButton);
	}
}
