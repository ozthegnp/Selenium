package actions;


import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;

public class testCaseTableSortingGreenKart {

	public static void main(String[] args) {
		// instantiating Chrome web driver
		System.setProperty("webdriver.chrome.driver", "//Users//Oz//Documents//Selenium//drivers//chromedriver");
		WebDriver driver = new ChromeDriver();

		// navigating to desired web site
		driver.get("https://rahulshettyacademy.com/seleniumPractise/#/offers");
		driver.findElement(By.cssSelector("tr th:nth-child(2)")).click();
		//driver.findElement(By.cssSelector("tr th:nth-child(2)")).click();

		List<WebElement> fruits = driver.findElements(By.cssSelector("tr td:nth-child(2)"));

		ArrayList<String> fruitsOriginal = new ArrayList<>();

		for(WebElement fruit : fruits) {
			fruitsOriginal.add(fruit.getText());
		}

		ArrayList<String> fruitsSorted = new ArrayList<>(fruitsOriginal);
		
		Collections.sort(fruitsSorted, Collections.reverseOrder());

		System.out.println(fruitsSorted.equals(fruitsOriginal));

		System.out.println(fruitsSorted);
		System.out.println(fruitsOriginal);

		driver.quit();


	}

}
