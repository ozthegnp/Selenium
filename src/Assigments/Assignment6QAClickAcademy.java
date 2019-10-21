package Assigments;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Assignment6QAClickAcademy {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "//Users//Oz//Documents//Selenium//drivers//chromedriver");
		WebDriver driver = new ChromeDriver();

		driver.get("http://qaclickacademy.com/practice.php");
		
		// select check box indicated by variable and create xpath String
		int checkBoxOptionNumber = 1;
		String xpathString = "//*[@id = 'checkBoxOption" + Integer.toString(checkBoxOptionNumber) + "']/..";
		
		// identifying parent label of chosen option
		WebElement checkBoxLabelWebElement = driver.findElement(By.xpath(xpathString));
		
		// extracting label of checkbox
		String checkBoxLabel = checkBoxLabelWebElement.getText();
		
		// creating WebElement for corresponding checkbox
		WebElement checkBoxWebElement = checkBoxLabelWebElement.findElement(By.tagName("input"));
		
		// checking if it is already checked, if not, click it
		if (!checkBoxWebElement.isSelected()) {
			checkBoxWebElement.click();
		}
		
		// Passing selected option to drop-down select
		Select dropDownSelect = new Select(driver.findElement(By.cssSelector("#dropdown-class-example")));		
		dropDownSelect.selectByVisibleText(checkBoxLabel);
		
		// type text to requested field
		driver.findElement(By.id("name")).sendKeys(checkBoxLabel);
		
		// click on alert button
		driver.findElement(By.id("alertbtn")).click();
		
		// save alert message to variable
		String alertMessage = driver.switchTo().alert().getText();
		
		// close alert by accepting it
		driver.switchTo().alert().accept();
		
		// Print results
		if (alertMessage.contains(checkBoxLabel)) {
			System.out.println("This was awesome");
		} else {
			System.out.println("O-oh, something went wrong");
		}
		
		//last visual check and quit
		Thread.sleep(2000L);		
		driver.quit();
		
	}

}
