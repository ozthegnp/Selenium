package DemoGroup;

import org.testng.annotations.Test;

import org.apache.logging.log4j.*;
import org.testng.AssertJUnit;
import java.io.IOException;
import org.testng.annotations.AfterTest;
import pageObjects.LandingPage;
import resources.Base;

public class TC2ValidateTitle extends Base {
	
	private static Logger Log = LogManager.getLogger(TC2ValidateTitle.class.getName());

	@Test
	public void basePageNavigation() throws IOException {
		driver = initDriver();
		Log.info("Driver is initalized");

		driver.get(prop.getProperty("url"));
		Log.info("Navigated to Home Page");

		LandingPage l = new LandingPage(driver);

		// compare the text from the browser with an actual value
		AssertJUnit.assertEquals("FEATURED COURSES", l.getTitle().getText());
		Log.info("Successfully validated title");
	}

	@AfterTest
	public void tearDown() {
		driver.close();
	}

}
