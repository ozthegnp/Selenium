import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class testCase2 {
	
	public static void main(String[] args) {				
		
		//invoke .exe file first for Firefox
		System.setProperty("webdriver.gecko.driver", "//Users//Oz//Documents//Selenium//drivers//geckodriver");
		
		//Create Driver Object for Chrome browser

		WebDriver driver = new FirefoxDriver();
		
		driver.get("http://www.google.com");
		System.out.println(driver.getTitle());
		driver.quit();
		
	}

}
