import org.openqa.selenium.WebDriver;
import org.openqa.selenium.safari.SafariDriver;

public class testcaseSafari {
	public static void main(String[] args) {				
		
		//invoke .exe file first for Firefox
		//System.setProperty("webdriver.safari.driver", "//Users//Oz//Documents//Selenium//drivers//geckodriver");
		
		//Create Driver Object for Chrome browser

		WebDriver driver = new SafariDriver();
		
		driver.get("http://www.google.com");
		System.out.println(driver.getTitle());
		driver.quit();
		
	}
}
