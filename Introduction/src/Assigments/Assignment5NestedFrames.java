package Assigments;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Assignment5NestedFrames {

	public static void main(String[] args) throws InterruptedException {

		// Instantiating Chrome web driver and setting path for chromedriver
		System.setProperty("webdriver.chrome.driver", "//Users//Oz//Documents//Selenium//drivers//chromedriver");
		WebDriver driver = new ChromeDriver();

		// navigating to desired website
		driver.get("https://the-internet.herokuapp.com/");

		// clicking to open Multiple Windows site
		driver.findElement(By.xpath("//a[contains(text(), 'Nested Frames')]")).click();

		// switch to Middle Frame - Solution 1
		driver.switchTo().frame(0).switchTo().frame(1);
		System.out.println("First Solution: " + driver.findElement(By.id("content")).getText());

		driver.switchTo().defaultContent();
		
		// switch to Middle Frame - Solution 2
		driver.switchTo().frame(driver.findElement(By.cssSelector("*[name = 'frame-top']")))
			  .switchTo().frame(driver.findElement(By.cssSelector("*[name = 'frame-middle']")));

		System.out.println("Second Solution: " + driver.findElement(By.id("content")).getText());

		driver.switchTo().defaultContent();

		Thread.sleep(2000L);
		driver.quit();

	}

}
