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

public class TC2ValidateTitle extends Base {

	@Test
	public void basePageNavigation() throws IOException {
		driver = initDriver();

		driver.get(prop.getProperty("url"));

		LandingPage l = new LandingPage(driver);
		
		// compare the text from the browser with an actual value
		AssertJUnit.assertEquals("FEATURED COURSES", l.getTitle().getText());		
		
	}
	@AfterTest
	public void tearDown() {
		driver.close();
	}

}
