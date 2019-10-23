package testNGTutorial;

import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.Test;

public class TestClass4 {
	
	@Test(groups= {"Smoke"})
	public void WebLoginHome() {
		// Selenium code
		System.out.print("TestClass4: ");
		System.out.println("WebLoginHome");
	}
	
	@Test
	public void MobileLoginHomeLoan() {
		// Appium
		System.out.print("TestClass4: ");
		System.out.println("MobileLoginHomeLoan");

	}
	
	@Test(groups= {"Smoke"})
	public void LogInAPICarLoan() {
		// Rest API automation
		System.out.print("TestClass4: ");
		System.out.println("LogInAPIHomeLoan");

	}
	
}
