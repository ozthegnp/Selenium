package Assigments;

import java.util.Iterator;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Assignment4WindowHandles {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "//Users//Oz//Documents//Selenium//drivers//chromedriver");
		WebDriver driver = new ChromeDriver();

		// navigating to desired website
		driver.get("https://the-internet.herokuapp.com/");

		// clicking to open Multiple Windows site
		driver.findElement(By.xpath("//a[contains(text(), 'Multiple Windows')]")).click();

		// triggering to create an addition window
		driver.findElement(By.xpath("//a[contains(text(), 'Click')]")).click();

		// creating window title set
		Set<String> windowTitles = driver.getWindowHandles();

		// using iterator to search between windows
		Iterator<String> iterator = windowTitles.iterator();

		// assigning value of windows by iterating
		String parentId = iterator.next();
		String childId = iterator.next();

		// switching to child window
		driver.switchTo().window(childId);
		System.out.println("The child window is: " + driver.getTitle());

		// switching back to parent window
		driver.switchTo().window(parentId);
		System.out.println("Switching back to parent window: " + driver.getTitle());
	}

}
