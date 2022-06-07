package Academy.E2E;

import java.io.IOException;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.openqa.selenium.WebDriver;
import org.testng.Assert;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class TestCase2 extends base {
	WebDriver driver;
	public static Logger log = LogManager.getLogger(TestCase2.class.getName());

@Test(dataProvider="getData")
public void pagenavigation(String Username, String Password) throws IOException {
	
	driver = invokebrowser();
	driver.get(prop.getProperty("url"));
	
	log.info("URL is launched");
	
	HomePage log2 = new HomePage(driver);
	LoginPage lp = log2.clicklogin();
	
	log.info("Clickedonlogin");
	
	//LoginPage lp = new LoginPage(driver);
	lp.Username().sendKeys(Username);
	lp.Password().sendKeys(Password);
	lp.login().click();
	
}

@DataProvider

public Object[][] getData() {
	Object[][] data = new Object[2][2];
	data[0][0] = "username1";
	data[0][1] ="password1";
	data[1][0] ="username2";
	data[1][1] ="password2";
	
	return data;
}

}
