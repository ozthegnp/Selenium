package actions;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class testcaseTablemanipulation {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "//Users//Oz//Documents//Selenium//drivers//chromedriver");
		WebDriver driver = new ChromeDriver();

		driver.get("https://www.cricbuzz.com/live-cricket-scorecard/22745/ind-vs-rsa-3rd-test-south-africa-tour-of-india-2019");
		
		// locating desired table
		WebElement table = driver.findElement(By.cssSelector("#innings_1 div[class = 'cb-col cb-col-100 cb-ltst-wgt-hdr']"));	
		
		// creating WebElement to collect all values that we are summing  
		List<WebElement> thirdElement = table.findElements(By.cssSelector("div[class = 'cb-col cb-col-100 cb-scrd-itms'] div[class='cb-col cb-col-8 text-right text-bold']"));
		
		// sum point with for cycle 
		int sumOfPoints = 0;
		
		for (int i = 0; i < thirdElement.size(); i++) {
			String currentString = thirdElement.get(i).getText();			
			sumOfPoints += Integer.parseInt(currentString);			
		}
		
		// adding extra point with different css path
		WebElement extra = table.findElement(By.cssSelector("div[class='cb-col cb-col-8 text-bold cb-text-black text-right']"));
		
		// converting extra point to integer
		int extraPoints = Integer.parseInt(extra.getText());	
		
		// adding extra point to sum
		sumOfPoints += extraPoints;
		
		// extracting sum of the website and converting to integer
		WebElement totalPoints = table.findElement(By.cssSelector("div.cb-col.cb-col-100.cb-scrd-itms:nth-child(15) > div.cb-col.cb-col-8.text-bold.text-black.text-right:nth-child(2)"));
		
		int sumOfPointFromWebsite = Integer.parseInt(totalPoints.getText());
		
		// checking if 2 values are matching
		if (sumOfPointFromWebsite == sumOfPoints) {
			System.out.println("The values are equal: " + sumOfPointFromWebsite + " = " + sumOfPoints);
		}
	}

}
