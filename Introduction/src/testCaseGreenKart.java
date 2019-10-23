import java.util.Arrays;
import java.util.List;
import java.util.concurrent.TimeUnit;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;


public class testCaseGreenKart {
	public static void main(String[] args) throws InterruptedException {

		// instantiating Chrome web driver
		System.setProperty("webdriver.chrome.driver", "//Users//Oz//Documents//Selenium//drivers//chromedriver");
		WebDriver driver = new ChromeDriver();

		// Setting implicit timeout
		//driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
		WebDriverWait explicitWaitObject = new WebDriverWait(driver, 5); 		


		// navigating to desired web site
		driver.get("https://rahulshettyacademy.com/seleniumPractise/");

		// creating array for desired food items which will be added to shopping cart
		String[] desiredItems = { "Brocolli", "Cucumber", "Beetroot" };

		// method of adding items
		AddItems(driver, desiredItems);

		// continuing shopping by checking out
		driver.findElement(By.cssSelector("[alt = 'Cart']")).click();
		driver.findElement(By.xpath("//button[contains(text(),'PROCEED TO CHECKOUT')]")).click();

		// applying coupon for discount
		String coupon = "rahulshettyacademy";
		
		explicitWaitObject.until(ExpectedConditions.visibilityOfElementLocated(By.cssSelector(".promoCode")));

		driver.findElement(By.cssSelector(".promoCode")).sendKeys(coupon);
		driver.findElement(By.cssSelector(".promoBtn")).click();
		
		//explicit wait until coupon applies
		explicitWaitObject.until(ExpectedConditions.visibilityOfElementLocated(By.cssSelector(".promoInfo")));
		
		driver.findElement(By.xpath("//button[text() = 'Place Order']")).click();


	}

	static public void AddItems(WebDriver driver, String[] desiredItems) {

		List<WebElement> products = driver.findElements(By.cssSelector("h4.product-name"));

		// convert array to array list to easy search
		List desiredItemsList = Arrays.asList(desiredItems);

		int itemsFound = 0;

		for (int i = 0; i < products.size(); i++) {
			// format by cutting of " -1Kg" form end of text
			String formatedName = products.get(i).getText().split(" ")[0];

			// check is name is presented in list
			if (desiredItemsList.contains(formatedName)) {
				driver.findElements(By.xpath("//div[@class='product-action']/button")).get(i).click();// click on item

				itemsFound++;

				if (itemsFound == desiredItems.length) {
					break;
				}
			}
		}

	}

}
