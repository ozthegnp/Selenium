package testNGTutorial;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.Test;

public class TestClass4 {
	public WebDriver driver = null;

	@Test(groups = { "Smoke" })
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

	@Test(groups = { "Smoke" })
	public void LogInAPICarLoan() {
		// Rest API automation
		System.out.print("TestClass4: ");
		System.out.println("LogInAPIHomeLoan");

	}

	@Test
	public void Login() throws IOException, InterruptedException {
		Properties prop = new Properties();
		FileInputStream fis = new FileInputStream(
				"//Users//Oz//Documents//Selenium//SeleniumRepo//testNGTutorial//src//testNGTutorial//dataDriven.properties");

		prop.load(fis);

		if (prop.getProperty("browser").equals("chrome")) {			
			System.setProperty("webdriver.chrome.driver", "//Users//Oz//Documents//Selenium//drivers//chromedriver");
			driver = new ChromeDriver();

		} else {			
			Assert.assertTrue(false);
		}

		driver.get(prop.getProperty("url"));
		Thread.sleep(2000L);
		driver.quit();
		

	}

}
