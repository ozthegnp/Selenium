package testNGTutorial;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class TestClass3 {
	
	@AfterMethod
	public void afterMethod() {
		System.out.println("will execute After every Mehtod in class");
	}
	
	@Test
	public void WebLogin() {
		// Selenium code
		System.out.println("WebLogin");
	}
	
	@Test(dependsOnMethods={"LogInAPICarLoan", "WebLogin"}, enabled = false, timeOut = 1)
	public void MobileLoginCarLoan() {
		// Appium
		System.out.println("MobileLoginCarLoan");

	}
	
	@Test
	public void LogInAPICarLoan() {
		// Rest API automation
		System.out.println("LogInAPICarLoan");

	}
	
	@BeforeMethod
	public void beforeMethod() {
		System.out.println("will execute Before every Mehtod in class");
	}
	
}
