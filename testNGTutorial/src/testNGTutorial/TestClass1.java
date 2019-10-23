package testNGTutorial;

import org.testng.annotations.AfterTest;
import org.testng.annotations.Test;

public class TestClass1 {
	
	@AfterTest
	public void LastExecution() {
		System.out.println("I will execute last");
	}
	
	@Test
	public void TC() {
		
		System.out.println("Hello");
		
	}
	
	@Test
	public void TC2() {
		System.out.println("Bye");

	}

}
