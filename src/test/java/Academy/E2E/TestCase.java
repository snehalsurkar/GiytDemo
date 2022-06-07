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



public class TestCase extends base {
private static Logger log = LogManager.getLogger(TestCase.class.getName());

	WebDriver driver;
	
@BeforeTest

public void prerequisites() throws IOException {
	
driver = invokebrowser();
driver.get(prop.getProperty("url")); 
log.info("URL is launched");
}

@Test
public void pagenavigation() throws IOException {
	

	
	HomePage log1 = new HomePage(driver);
	Assert.assertEquals(log1.title().getText(), "FEATURED COURSES");
	log.info("URL is launched");
	
}
@AfterTest
 
public void tearout() {
	driver.close();
	log.info("browser is closed");
}


}
