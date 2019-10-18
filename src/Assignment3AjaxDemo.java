import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Assignment3AjaxDemo {

	public static void main(String[] args) {

		// Instantiating Chrome web driver
		System.setProperty("webdriver.chrome.driver", "//Users//Oz//Documents//Selenium//drivers//chromedriver");
		WebDriver driver = new ChromeDriver();

		// Setting explicit timeout by creating WebDriverWait object
		int explicitTimeOut = 5; //in seconds
		WebDriverWait explicitWaitObject = new WebDriverWait(driver, explicitTimeOut);

		// Navigating to desired website
		driver.get("http://www.itgeared.com/demo/1506-ajax-loading.html");
		
		// Click on  "Click to load get data via Ajax!"
		driver.findElement(By.xpath("//div[@id = 'content'] / a[2]")).click();
		
		// Wait explicoitly for result text to appear
		explicitWaitObject.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//div[contains(text(), 'Process completed')]")));
		
		// Extracting text and assigning it to variable, then print
		String results = driver.findElement(By.cssSelector("#results")).getText();
		
		System.out.println(results);
		
		// Clean up
		driver.quit();
	}

}
