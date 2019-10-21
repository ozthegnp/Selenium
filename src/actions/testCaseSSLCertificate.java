package actions;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.remote.CapabilityType;
import org.openqa.selenium.remote.DesiredCapabilities;
import com.sun.jdi.connect.spi.TransportService.Capabilities;

public class testCaseSSLCertificate {

	public static void main(String[] args) {
		
		DesiredCapabilities ch = DesiredCapabilities.chrome();
		// ch.acceptInsecureCerts(); Interchangeable with below
		
		ch.setCapability(CapabilityType.ACCEPT_INSECURE_CERTS, true);
		ch.setCapability(CapabilityType.ACCEPT_SSL_CERTS, true);		
		
		ChromeOptions c = new ChromeOptions();
		c.merge(ch);
		
		System.setProperty("webdriver.chrome.driver", "//Users//Oz//Documents//Selenium//drivers//chromedriver");
		WebDriver driver = new ChromeDriver();

	}

}
