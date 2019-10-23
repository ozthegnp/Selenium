package actions;

import java.awt.RenderingHints.Key;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class actionsDemo {

	public static void main(String[] args) {
		
		// Instantiating Chrome web driver
		System.setProperty("webdriver.chrome.driver", "//Users//Oz//Documents//Selenium//drivers//chromedriver");
		WebDriver driver = new ChromeDriver();

		// Navigating to desired website
		//driver.get("https://www.w3schools.com/howto/howto_css_dropdown.asp");
		
		Actions chromeActions =  new Actions(driver);
		
		//WebElement hoverW3SElement = driver.findElement(By.cssSelector("div#main button.dropbtn"));
		
		//chromeActions.moveToElement(hoverW3SElement).build().perform();
		
		//try same action on Amazon
		driver.get("https://www.amazon.com");
		
		WebElement searchAmazonElement = driver.findElement(By.id("twotabsearchtextbox"));
		
		chromeActions.moveToElement(searchAmazonElement).click().keyDown(Keys.SHIFT).sendKeys("hello").doubleClick().build().perform();
		

		WebElement hoverAmazonElement = driver.findElement(By.id("nav-link-accountList"));
		chromeActions.moveToElement(hoverAmazonElement).contextClick().build().perform();
		
		

		
		
		

		
		
		
		
		
		

	}

}
