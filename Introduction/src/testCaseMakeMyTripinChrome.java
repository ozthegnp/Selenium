import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class testCaseMakeMyTripinChrome {

	public static void main(String[] args) throws InterruptedException {
		
		System.setProperty("webdriver.chrome.driver", "//Users//Oz//Documents//Selenium//drivers//chromedriver");
		WebDriver webDriver = new ChromeDriver();
		
		webDriver.get("https://makemytrip.com");

		WebElement source = webDriver.findElement(By.id("fromCity"));

		source.click();

		source = webDriver.findElement(By.cssSelector("input[placeholder='From']"));

		source.click();

		source.sendKeys("MUM");

		source.sendKeys(Keys.ARROW_DOWN);

		source.sendKeys(Keys.ENTER);

		WebElement destination = webDriver.findElement(By.cssSelector("input[placeholder='To']"));

		destination.click();

		destination.sendKeys("DEL");

		for(int i = 1; i < 4; i++) {
			destination.sendKeys(Keys.ARROW_DOWN);
		}

		destination.sendKeys(Keys.ENTER);
		
	}

}
