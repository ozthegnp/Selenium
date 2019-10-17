import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;

public class qaclickacademyAssignment1 {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "//Users//Oz//Documents//Selenium//drivers//chromedriver");
		WebDriver driver = new ChromeDriver();

		driver.get("http://qaclickacademy.com/practice.php");
		
		WebElement checkboxOption1 = driver.findElement(By.id("checkBoxOption1"));
		
		checkboxOption1.click();		
		Assert.assertTrue(checkboxOption1.isSelected());
		
		checkboxOption1.click();
		Assert.assertFalse(checkboxOption1.isSelected());
		
		int num_of_checkboxes = driver.findElements(By.cssSelector("input[type = 'checkbox']")).size();
		System.out.println(num_of_checkboxes);
	}

}
