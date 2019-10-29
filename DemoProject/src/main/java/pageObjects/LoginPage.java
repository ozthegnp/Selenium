package pageObjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import resources.Base;

public class LoginPage {

	public WebDriver driver;

	Base b = new Base();

	public LoginPage(WebDriver driver) {
		this.driver = driver;
	}


	By email = By.cssSelector("#user_email");
	By password = By.cssSelector("#user_password");
	By submit = By.cssSelector("input[type = 'submit']");



	public  WebElement getEmail() {

		return driver.findElement(email);
	}

	public  WebElement getPassword() {

		return driver.findElement(password);
	}
	
	public  WebElement getSubmit() {

		return driver.findElement(submit);
	}


}
