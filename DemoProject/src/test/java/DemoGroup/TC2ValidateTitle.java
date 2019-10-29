package DemoGroup;

import java.io.IOException;

import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import junit.framework.Assert;
import pageObjects.LandingPage;
import pageObjects.LoginPage;
import resources.Base;

public class TC2ValidateTitle extends Base {

	@Test
	public void basePageNavigation() throws IOException {
		driver = initDriver();

		driver.get("http://www.qaclickacademy.com/");

		LandingPage l = new LandingPage(driver);
		
		// compare the text from the browser with an actual value
		Assert.assertEquals("FEATURED COURSES", l.getTitle().getText());		
		
	}

}
