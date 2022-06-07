package Academy.E2E;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class LoginPage {
	
	WebDriver driver;
	
	public LoginPage(WebDriver driver) {
		this.driver = driver;
	}
	
	private By username = By.id("user_email");
	private By password = By.name("password");
	private By login = By.cssSelector("input[@type='submit']");
	
	public WebElement Username() {
		return driver.findElement(username);
	}
	
	public WebElement Password() {
		return driver.findElement(password);
	}
	public WebElement login() {
		return driver.findElement(login);
	}
	

}
