package testNGTutorial;

import org.testng.annotations.AfterTest;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class TestClass1 {
	
	@AfterTest
	public void LastExecution() {
		System.out.println("I will execute last");
	}
	
	@Parameters({"URL", "APIKey/username"})
	@Test
	public void TC(String urlname, String username) {
		
		System.out.print("TestClass1: ");
		System.out.println(urlname + " " + username);
		
	}
	
	@Test
	public void TC2() {
		System.out.print("TestClass1: ");
		System.out.println("Bye");

	}
	@DataProvider
	public Object getDate() {
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
