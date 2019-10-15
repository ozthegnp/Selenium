import org.openqa.selenium.WebDriver;
import org.openqa.selenium.safari.SafariDriver;

public class testcaseSafari {
	public static void main(String[] args) {				
		
		//invoke .exe file first for Firefox
		//System.setProperty("webdriver.safari.driver", "//Users//Oz//Documents//Selenium//drivers//geckodriver");
		
		//Create Driver Object for Chrome browser

		WebDriver driver = new SafariDriver();
		
		driver.get("http://www.google.com"); //hit url on the browser
		
		String site_url = driver.getCurrentUrl();// verify if landed on correct url
		
		//System.out.println(driver.getPageSource());
		
		System.out.println(driver.getTitle());
		System.out.println(site_url); 
		
		driver.get("http://yahoo.com");
		driver.navigate().back();	
		
		driver.close(); //closes current browser
		//driver.quit(); //closes all the browsers opened by Selenium scripts
		
		
				
	}
}
