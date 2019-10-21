package actions;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class testCaseJavaScriptExecutor {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "//Users//Oz//Documents//Selenium//drivers//chromedriver");
		WebDriver driver = new ChromeDriver();
		Actions a = new Actions(driver);

		// Navigating to desired website
		driver.get("https://ksrtc.in/oprs-web/");
		
		// target: extracting text from input box
		WebElement fromPlaceName= driver.findElement(By.cssSelector("#fromPlaceName"));
		
		fromPlaceName.sendKeys("BENG");
		fromPlaceName.sendKeys(Keys.DOWN);
		System.out.println(fromPlaceName.getText());// conclusion: cannot use getText for hidden Elements
		
		// use JavaScript exexutor instead		
		JavascriptExecutor js = (JavascriptExecutor)driver;
		
		String script = "return document.getElementById(\"fromPlaceName\").value;";
		String text = (String) js.executeScript(script);
		
		
		// creating counter to avoid infinite loop
		int numberOfKeyDowns = 0;
		
		while(!text.equals("BENGALURU AIRPORT")) {
			
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
