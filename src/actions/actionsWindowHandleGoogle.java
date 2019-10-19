package actions;

import java.util.Iterator;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class actionsWindowHandleGoogle {

	public static void main(String[] args) {

		System.setProperty("webdriver.chrome.driver", "//Users//Oz//Documents//Selenium//drivers//chromedriver");
		WebDriver driver = new ChromeDriver();

		// Navigating to desired website
		driver.get("http://accounts.google.com/signup");

		Actions chromeActions = new Actions(driver);

		WebElement helpGoogleElement = driver.findElement(By.cssSelector(".RwBngc a"));

		helpGoogleElement.click();
		System.out.println("Current window: " + driver.getTitle());

		// creating window title set
		Set<String> windowTitles = driver.getWindowHandles();

		// using iterator to search between windows
		Iterator<String> iterator = windowTitles.iterator();

		// assigning value to windows
		String parentId = iterator.next();
		String childId = iterator.next();

		// switching to child window
		driver.switchTo().window(childId);
		System.out.println("Switching to :" + driver.getTitle());
		
		// switching back to parent window
		driver.switchTo().window(parentId);
		System.out.println("Switching to :" + driver.getTitle());

		// chromeActions.moveToElement(helpGoogleElement).click().keyDown(Keys.SHIFT).sendKeys("hello").doubleClick().build().perform();
	}

}
