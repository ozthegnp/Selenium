package actions;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class testcaseCalendarUI {

	public static void main(String[] args) {

		System.setProperty("webdriver.chrome.driver", "//Users//Oz//Documents//Selenium//drivers//chromedriver");
		WebDriver driver = new ChromeDriver();

		driver.get("https://www.path2usa.com/travel-companions");
		
		//indicate desired date to select
		String month = "August";
		String day = "7";
		
		driver.findElement(By.cssSelector("#travel_date")).click();
		
		WebElement monthWebElement = driver.findElement(By.cssSelector(".datepicker-days .datepicker-switch"));
		
		
		while (!monthWebElement.getText().contains(month)) {
			driver.findElement(By.cssSelector(".datepicker-days .next")).click();
		}
		
		
		List<WebElement> dates = driver.findElements(By.className("day"));
		
		int numberOfElementsInDates = dates.size();
		
		for (int i = 0; i < numberOfElementsInDates; i++ ) {
			 String currentDay = dates.get(i).getText();
			 
			 if (currentDay.equalsIgnoreCase(day)) {
				 dates.get(i).click();
				 break;
			 }
		}
		
		

	}

}
