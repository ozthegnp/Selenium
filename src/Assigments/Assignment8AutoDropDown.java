package Assigments;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Assignment8AutoDropDown {

	public static void main(String[] args) {

		System.setProperty("webdriver.chrome.driver", "//Users//Oz//Documents//Selenium//drivers//chromedriver");
		WebDriver driver = new ChromeDriver();

		driver.get("http://qaclickacademy.com/practice.php");

		WebElement fromPlaceName= driver.findElement(By.cssSelector("#autocomplete"));

		fromPlaceName.sendKeys("UNI");
		fromPlaceName.sendKeys(Keys.DOWN);
		System.out.println(fromPlaceName.getText());// conclusion: cannot use getText for hidden Elements

		// use JavaScript executor instead		
		JavascriptExecutor js = (JavascriptExecutor)driver;

		String script = "return document.getElementById(\"autocomplete\").value;";
		String text = (String) js.executeScript(script);


		// creating counter to avoid infinite loop
		int numberOfKeyDowns = 0;

		while(!text.equalsIgnoreCase("UNITED STATES")) {

			fromPlaceName.sendKeys(Keys.DOWN);
			text = (String) js.executeScript(script);
			System.out.println(text);

			numberOfKeyDowns++;
			if (numberOfKeyDowns == 10) {
				System.out.println("element not found after 10 key down");
				break;
			}


		}

		driver.quit();


	}

}
