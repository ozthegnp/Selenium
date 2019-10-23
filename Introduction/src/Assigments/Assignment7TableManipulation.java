package Assigments;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Assignment7TableManipulation {

	public static void main(String[] args) {
		
		System.setProperty("webdriver.chrome.driver", "//Users//Oz//Documents//Selenium//drivers//chromedriver");
		WebDriver driver = new ChromeDriver();

		driver.get("http://qaclickacademy.com/practice.php");		
		
		// creating WebElement of table
		WebElement table = driver.findElement(By.cssSelector("#product tbody"));
		
		// Task 1 print number of rows
		int rowNumber = table.findElements(By.cssSelector("tr")).size();
		System.out.println("The number of rows are: " + rowNumber);
		
		// Task 2 print number of columns
		int colNumber = table.findElements(By.cssSelector("tr th")).size();
		System.out.println("The number of columns are: " + colNumber);

		// Task 3 print 2nd row
		int requiredRow = 2;
		// building css selector for nth-child(adding +1 to skip header)
		WebElement rowWebelement = table.findElement(By.cssSelector("tr:nth-child(" + Integer.toString(requiredRow + 1) + ")"));

		System.out.println(rowWebelement.getText());
		
		driver.quit();
	}

}
