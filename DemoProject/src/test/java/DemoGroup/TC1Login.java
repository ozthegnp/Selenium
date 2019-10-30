package DemoGroup;

import org.testng.annotations.Test;
import java.io.IOException;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import pageObjects.LandingPage;
import pageObjects.LoginPage;
import resources.Base;

public class TC1Login extends Base {

	@BeforeMethod
	public void initalize() throws IOException {
		driver = initDriver();

		driver.get(prop.getProperty("url"));

	}

	@Test(dataProvider = "getData")
	public void basePageNavigation(String username, String password, String text) throws IOException {

		LandingPage l = new LandingPage(driver);
		l.getLogin().click();

		LoginPage lp = new LoginPage(driver);
		lp.getEmail().sendKeys(username);
		lp.getPassword().sendKeys(password);

		System.out.println(text);
		lp.getSubmit().click();

	}

	@DataProvider
	public Object[][] getData() {
		Object[][] data = new Object[2][3];

		// 0th row
		data[0][0] = "restricted.user@gmail.com";
		data[0][1] = "12345";
		data[0][2] = "Resticted User";

		// 1th row
		data[1][0] = "non.restricted.user@gmail.com";
		data[1][1] = "45678";
		data[1][2] = "Non-Resticted User";

		return data;

	}

	@AfterMethod
	public void tearDown() {
		driver.close();
	}

}
