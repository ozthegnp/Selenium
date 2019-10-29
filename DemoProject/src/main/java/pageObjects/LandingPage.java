package pageObjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import resources.Base;

public class LandingPage {

	public WebDriver driver;

	Base b = new Base();

	public LandingPage(WebDriver driver) {
		this.driver = driver;
	}


	By signInLink = By.cssSelector("a[href*= 'sign_in']");
	By title = By.cssSelector("div.container > h2:nth-child(1)']");



	public  WebElement getLogin() {

		return driver.findElement(signInLink);
	}

	public  WebElement getTitle() {

		return driver.findElement(title);
	}


}
