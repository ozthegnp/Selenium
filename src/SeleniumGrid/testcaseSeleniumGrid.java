package SeleniumGrid;

import java.net.MalformedURLException;
import java.net.URL;

import org.openqa.selenium.Platform;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.remote.RemoteWebDriver;

public class testcaseSeleniumGrid {

	public static void main(String[] args) throws MalformedURLException {
		// Desired Capabilities
		DesiredCapabilities dc = new DesiredCapabilities();
		dc.setBrowserName("safari");
		dc.setPlatform(Platform.MAC);
		
		//System.setProperty("webdriver.chrome.driver", "//Users//Oz//Documents//Selenium//drivers//chromedriver");
		WebDriver driver = new RemoteWebDriver(new URL("http://10.0.0.19:4444/wd/hub"),dc);
		
		driver.get("http://google.com");
		
		
		

	}

}
