package Academy.E2E;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.time.Duration;
import java.util.Properties;
import java.util.concurrent.TimeUnit;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.testng.annotations.Test;

public class base {
	
	public WebDriver driver;
	public Properties prop;
	public WebDriver invokebrowser() throws IOException {
	prop = new Properties();
	FileInputStream fis = new FileInputStream(System.getProperty("user.dir")+"\\src\\main\\java\\Academy\\E2E\\data.properties");
	prop.load(fis);
	
	String Browsername = System.getProperty("browser");
	//String Browsername = prop.getProperty("browser");
	if(Browsername.contains("chrome")) {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\snehal\\Documents\\chromedriver.exe");
		ChromeOptions options = new ChromeOptions();
		if(Browsername.contains("headless")) {
			options.addArguments("headless");
			}
		driver = new ChromeDriver(options);
	}
	else if(Browsername.equals("Firefox")) {
	//similar code for firefox will be placed here	
	}
	
	driver.manage().window().maximize();
	driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));	
	
	return driver;
}
	public void getScreenshot(String testcasename, WebDriver driver) throws IOException {
		TakesScreenshot ts = (TakesScreenshot)driver;
		File source = ts.getScreenshotAs(OutputType.FILE);
		String Destination = System.getProperty("user.dir")+"\\reports\\"+ testcasename +".png";
		FileUtils.copyFile(source,new File(Destination));
		
		
	}
}
