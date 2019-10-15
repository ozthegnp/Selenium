import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Demo {
	
	public static void main(String[] args) {				
		
		//invoke .exe file first
		System.setProperty("webdriver.chrome.driver", "//Users//Oz//Documents//Selenium//drivers//chromedriver");
		
		//Create Driver Object for Chrome browser

		WebDriver driver = new ChromeDriver();
		
		driver.get("http://www.google.com");
		System.out.println(driver.getTitle());
		driver.quit();
		
	}

}
