package Academy.E2E;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class HomePage {

	WebDriver driver;
	public HomePage(WebDriver driver) {
		this.driver = driver;
	}
 private By login = By.cssSelector("a[href*='sign_in']");
 private By practise = By.cssSelector("a[href*='AutomationPractise']");
 private By title = By.xpath("//*[@id=\"content\"]/div/div/h2");
 public LoginPage clicklogin() {
	 
	  driver.findElement(login).click();
	  LoginPage lp = new LoginPage(driver);
	  return lp;
 }
 public WebElement title() {
	 
	 return driver.findElement(title);
 }
 public WebElement practise() {
	 
	 return driver.findElement(practise);
 }
	
}
