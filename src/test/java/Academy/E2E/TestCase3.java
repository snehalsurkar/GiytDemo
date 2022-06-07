package Academy.E2E;

import java.io.IOException;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.openqa.selenium.WebDriver;
import org.testng.Assert;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class TestCase3 extends base {
	public static Logger log = LogManager.getLogger(TestCase3.class.getName());
	
	WebDriver driver;
	@BeforeTest
	public void initialize() throws IOException {
		driver = invokebrowser();
		driver.get(prop.getProperty("url"));
		log.info("URL is launched");
	}

@Test()
public void pagenavigation() throws IOException {
	
	
	HomePage log = new HomePage(driver);
	
	Assert.assertTrue(log.practise().isDisplayed());
	
}

@AfterTest
public void teardown() {
	driver.close();
	log.info("browser is closed");
}

}
