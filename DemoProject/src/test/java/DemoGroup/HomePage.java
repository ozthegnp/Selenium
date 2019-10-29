package DemoGroup;

import java.io.IOException;

import org.testng.annotations.Test;

import pageObjects.LandingPage;
import resources.Base;

public class HomePage extends Base{
	
	@Test
	public void basePageNavigation() throws IOException {
		driver = initDriver();
		
		driver.get("http://www.qaclickacademy.com/");
		
		LandingPage l = new LandingPage(driver);
		
		l.getLogin().click();
		
		}

}
