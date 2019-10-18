import java.util.Arrays;
import java.util.List;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class testCaseGreenKart {
	public static void main(String[] args) throws InterruptedException {

		System.setProperty("webdriver.chrome.driver", "//Users//Oz//Documents//Selenium//drivers//chromedriver");
		WebDriver driver = new ChromeDriver();

		driver.get("https://rahulshettyacademy.com/seleniumPractise/");

		String[] desiredItems = { "Brocolli", "Cucumber", "Beetroot" };

		List<WebElement> products = driver.findElements(By.cssSelector("h4.product-name"));

		// convert array to array list to easy search
		List desiredItemsList = Arrays.asList(desiredItems);
		
		int itemsFound = 0;

		for (int i = 0; i < products.size(); i++) {
			// format by cutting of "-1Kg" form end of text
			String[] itemName = products.get(i).getText().split("-");
			String formatedName = itemName[0].trim();

			// check is name is presented in list
			if (desiredItemsList.contains(formatedName)) {
				driver.findElements(By.xpath("//div[@class='product-action']/button")).get(i).click();//click on item
				
				itemsFound++;
				
				if (itemsFound == desiredItems.length) {
					break;
				}
			}
			
			
		}

	}

}
