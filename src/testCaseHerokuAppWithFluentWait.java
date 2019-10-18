import java.time.Duration;
import java.util.NoSuchElementException;
import java.util.function.Function;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.FluentWait;
import org.openqa.selenium.support.ui.Wait;
import org.openqa.selenium.support.ui.WebDriverWait;

public class testCaseHerokuAppWithFluentWait {

	public static void main(String[] args) {

		// Instantiating Chrome web driver
		System.setProperty("webdriver.chrome.driver", "//Users//Oz//Documents//Selenium//drivers//chromedriver");
		WebDriver driver = new ChromeDriver();

		// Navigating to desired website
		driver.get("http://the-internet.herokuapp.com/dynamic_loading/1");

		driver.findElement(By.cssSelector("#start button")).click();

		// Utalizing fluent wait to confrim if text is visible
		Wait<WebDriver> fluentWait = new FluentWait<WebDriver>(driver)
				.withTimeout(Duration.ofSeconds(30))
				.pollingEvery(Duration.ofSeconds(3))
				.ignoring(NoSuchElementException.class);
		
		// customized method to check if text is displayed
		WebElement foo = fluentWait.until(new Function<WebDriver, WebElement>() {
			public WebElement apply(WebDriver driver) {
				if(driver.findElement(By.cssSelector("#finish h4")).isDisplayed()) {					
					return driver.findElement(By.cssSelector("#finish h4"));					
				} else {					
					return null;
				}
			}
		});
		
		// Extract output
		System.out.println(driver.findElement(By.cssSelector("#finish h4")).getText());
		
		driver.quit();		
		
	}

}
