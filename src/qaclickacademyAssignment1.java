import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;

public class qaclickacademyAssignment1 {
	
	static String my_name = "Oscar";

	public static void main(String[] args) throws InterruptedException {
		
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
		
		driver.findElement(By.id("name")).sendKeys(my_name);
		driver.findElement(By.id("alertbtn")).click();
		driver.switchTo().alert().accept();	

		driver.findElement(By.id("name")).sendKeys(my_name);
		driver.findElement(By.id("confirmbtn")).click();
		
		System.out.println(driver.switchTo().alert().getText());
		driver.switchTo().alert().dismiss();
		
		Thread.sleep(4000L);
		driver.quit();
		

		
	}

}
