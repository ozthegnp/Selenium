package testNGTutorial;

import org.testng.annotations.AfterTest;
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
	public void getDate() {
		
	}

}
