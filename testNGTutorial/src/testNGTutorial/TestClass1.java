package testNGTutorial;

import org.testng.Assert;
import org.testng.annotations.AfterTest;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Optional;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class TestClass1 {
	
	@AfterTest
	public void LastExecution() {
		System.out.println("I will execute last");
	}
	
	@Parameters({"URL", "APIKey/username"})
	@Test
	public void TC1(@Optional("default_url") String urlname, @Optional("default_username") String username) {
		
		System.out.print("TestClass1: ");
		System.out.println(urlname + " " + username);
		
	}
	
	@Test(dataProvider = "getData")
	public void TC2(String username, String password) {
		System.out.print("TestClass1: ");
		System.out.println(username + " " + password);

	}
	
	@Test
	public void failure() {
		System.out.print("TestClass1: ");
		System.out.println("I will always fail");
		Assert.assertTrue(false);
	}
	
	@DataProvider
	public Object getData() {
		// Defining object for 3 users and 2 attributes
		Object[][] data = new Object[3][2];
		int usernameIndex = 0;
		int passwordIndex = 1;		
		
		data[0][usernameIndex] = "Anna";
		data[0][passwordIndex] = "A1234";
		
		data[1][usernameIndex] = "Bobby";
		data[1][passwordIndex] = "B1234";
		
		data[2][usernameIndex] = "Charlie";
		data[2][passwordIndex] = "C1234";
		
		return data;
		
	}

}
