package DemoGroup;

import org.testng.annotations.Test;
import org.testng.AssertJUnit;
import java.io.IOException;

import org.testng.annotations.AfterTest;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import pageObjects.LandingPage;
import pageObjects.LoginPage;
import resources.Base;

public class TC3ValidateNavBar extends Base {

	@Test
	public void NavBarIsDisplayed() throws IOException {
		driver = initDriver();
		
		driver.get(prop.getProperty("url"));		

		LandingPage l = new LandingPage(driver);
		
		// compare the text from the browser with an actual value
		AssertJUnit.assertTrue(l.getNavBar().isDisplayed());		
		
	}
	
	@AfterTest
	public void tearDown() {
		driver.close();
	}
	

}
