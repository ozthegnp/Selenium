import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Assignment2ClearTrip {

	public static void main(String[] args) throws InterruptedException {

		System.setProperty("webdriver.chrome.driver", "//Users//Oz//Documents//Selenium//drivers//chromedriver");
		WebDriver driver = new ChromeDriver();

		// navigate to web site
		driver.get("https://www.cleartrip.com");

		// Select current date
		driver.findElement(By.cssSelector("input#DepartDate")).click();
		driver.findElement(By.cssSelector("a[class *= 'ui-state-highlight']")).click();

		// Select 5 adults
		Select adult_select = new Select(driver.findElement(By.id("Adults")));
		adult_select.selectByValue("5");

		// Select 2 children
		Select children_select = new Select(driver.findElement(By.id("Childrens")));
		children_select.selectByValue("2");

		// Click More options and set Quantas as preferred airline
		String preferred_airline = "Quantas";

		driver.findElement(By.cssSelector("a#MoreOptionsLink")).click();

		Thread.sleep(1000L);// ensure 'More options' open properly

		driver.findElement(By.id("AirlineAutocomplete")).sendKeys(preferred_airline);
		driver.findElement(By.id("SearchBtn")).click();

		// Grab error message due to the lack of departure and arrival airport
		String homeErrorMessage = (driver.findElement(By.id("homeErrorMessage")).getText());
		System.out.println(homeErrorMessage);// printing to be visible in console

	}

}
