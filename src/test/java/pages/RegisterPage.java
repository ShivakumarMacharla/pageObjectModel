package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class RegisterPage {
	WebDriver driver;
	//constructor
	
	public RegisterPage(WebDriver driver) {
		this.driver = driver;   
		
	}

	//locators
	private By fName = By.id("first_name");
	private By lName = By.id("last_name");
	private By mobile = By.id("mobile");
	private By email = By.id("email");
	private By password = By.id("password");
	private By Confpassword = By.id("repassword");
	private By submit = By.id("register");
	
	//methods
	public WebElement enterFirstName() {
		return driver.findElement(fName);
	}
	public WebElement enterLastName() {
		return driver.findElement(lName);
	}
	public WebElement enterMobileNumber() {
		return driver.findElement(mobile);
	}
	public WebElement enterEmail() {
		return driver.findElement(email);
	}
	public WebElement enterPassword() {
		return driver.findElement(password);
	}
	public WebElement enterConfirmPassword() {
		return driver.findElement(Confpassword);
	}
	public WebElement enterSubmitButton() {
		return  driver.findElement(submit);
		//return (explicitWait(10));
	}
	
	
}
