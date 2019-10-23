package actions;

import java.util.Iterator;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class testCaseofScope {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "//Users//Oz//Documents//Selenium//drivers//chromedriver");
		WebDriver driver = new ChromeDriver();
		Actions a = new Actions(driver);

		// Navigating to desired website
		driver.get("http://qaclickacademy.com/practice.php");
		
		//checking all links on website
		System.out.println("Total links on page: " + driver.findElements(By.tagName("a")).size());
		
		// limiting webDriver scope by creating webElement and using driver methods on that		
		WebElement footerDriver = driver.findElement(By.cssSelector("#gf-BIG"));//footer section
		
		System.out.println("Total links in footer: " + footerDriver.findElements(By.cssSelector("a")).size());
		
		// further limiting scope to first column of footer
		WebElement firstColOfFooterDriver = footerDriver.findElement(By.xpath("//table/tbody/tr/td[1]/ul"));
		
		int numberOfLinksInFooter = firstColOfFooterDriver.findElements(By.cssSelector("a")).size();
				
		System.out.println("Total links in first coulmn of footer: " + numberOfLinksInFooter);
		
		for (int i = 1; i < numberOfLinksInFooter; i++) {
						
			a.moveToElement(firstColOfFooterDriver.findElements(By.tagName("a")).get(i))
				.keyDown(Keys.COMMAND)
				.click()
				.keyUp(Keys.COMMAND)
				.build()
				.perform();	
			
		}
		
		// checking if links are working of footer's first column using if title exist
		
		// creating window title set
		Set<String> windowTitles = driver.getWindowHandles();

		// using iterator to search between windows
		Iterator<String> iterator = windowTitles.iterator();
		
		// while iterator has a next element, grabbing title and printing
		while(iterator.hasNext()) {
			driver.switchTo().window(iterator.next());
			System.out.println("Current title :" + driver.getTitle());
						
		}		
		
		driver.quit();
	}

}
