package actions;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class testCaseUsingFrames {
	public static void main(String[] args) throws InterruptedException {

		// Instantiating Chrome web driver
		System.setProperty("webdriver.chrome.driver", "//Users//Oz//Documents//Selenium//drivers//chromedriver");
		WebDriver driver = new ChromeDriver();

		// Navigating to desired website
		driver.get("https://jqueryui.com/droppable/");
		
		System.out.println(driver.findElements(By.tagName("iframe")).size());
		
		
		// switch to frame of drag and drop
		//driver.switchTo().frame(driver.findElement(By.cssSelector(".demo-frame")));
		driver.switchTo().frame(0);

		WebElement source = driver.findElement(By.id("draggable"));
		WebElement target = driver.findElement(By.id("droppable"));
		
		Actions a = new Actions(driver);
		
		a.dragAndDrop(source, target).build().perform();
		
		driver.switchTo().defaultContent();
		
		Thread.sleep(2000L);
		driver.quit();
		
		
		

	}
}
