package DemoGroup;

import java.io.IOException;

import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import junit.framework.Assert;
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
		Assert.assertTrue(l.getNavBar().isDisplayed());		
		
	}

}
