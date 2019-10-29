package resources;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.safari.SafariDriver;

public class Base {
	
	public WebDriver driver;
	public Properties prop;

	public WebDriver initDriver() throws IOException {

		prop = new Properties();
		FileInputStream fis = new FileInputStream("//Users//Oz//Documents//Selenium//SeleniumRepo//DemoProject//src//main//java//resources//data.properties");
		prop.load(fis);
		String browserName = prop.getProperty("browser");

		if(browserName.equalsIgnoreCase("chrome")) {
			// Instantiating Chrome web driver
			System.setProperty("webdriver.chrome.driver", "//Users//Oz//Documents//Selenium//drivers//chromedriver");
			driver = new ChromeDriver();

		} else if(browserName.equalsIgnoreCase("firefox")) {
			// Instantiating Firefox web driver
			System.setProperty("webdriver.firefox.driver", "//Users//Oz//Documents//Selenium//drivers//geckodriver");
			driver = new FirefoxDriver();

		} else if(browserName.equalsIgnoreCase("safari")) {
			// Instantiating Chrome web driver
			driver = new SafariDriver();

		}
		
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		
		return driver;

	}

}
