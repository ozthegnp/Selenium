package testNGTutorial;

import java.io.IOException;

import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class TestClass2 extends TestClass4{
	@AfterSuite
	public void afterSuite() {
		System.out.print("TestClass2: ");
		System.out.println("I am printinglast");
	}
	
	@Test(groups= {"Smoke"})
	public void TC1() throws IOException, InterruptedException {
		Login();
		System.out.print("TestClass2: ");
		System.out.println("Hello in test class 2");
	}
	@Test
	public void TC2() {
		System.out.print("TestClass2: ");
		System.out.println("Hello in test class 2");
	}
	
	@BeforeTest
	public void prerequisite() {
		System.out.print("TestClass2: ");
		System.out.println("I will execute first");
	}

}
