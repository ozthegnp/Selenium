package DemoGroup;

import org.testng.annotations.Test;

import org.apache.logging.log4j.*;
import org.testng.AssertJUnit;
import java.io.IOException;

import org.testng.annotations.AfterTest;

import pageObjects.LandingPage;
import resources.Base;

public class TC3ValidateNavBar extends Base {
	private static Logger Log = LogManager.getLogger(TC3ValidateNavBar.class.getName());

	@Test
	public void NavBarIsDisplayed() throws IOException {
		driver = initDriver();
		Log.info("Driver is initalized");

		driver.get(prop.getProperty("url"));
		Log.info("Navigated to Home Page");


		LandingPage l = new LandingPage(driver);

		// compare the text from the browser with an actual value
		AssertJUnit.assertTrue(l.getNavBar().isDisplayed());
		Log.info("Navigaition bar is displayed");

	}

	@AfterTest
	public void tearDown() {
		driver.close();
	}

}
