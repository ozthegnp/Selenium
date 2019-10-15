import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.safari.SafariDriver;

public class facebookTestCase {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "//Users//Oz//Documents//Selenium//drivers//chromedriver");

		WebDriver driver = new ChromeDriver();
		
		driver.get("https://facebook.com"); //hit url on the browser		
		driver.findElement(By.id("email")).sendKeys("This is my first code");
		driver.findElement(By.name("pass")).sendKeys("123456");
		driver.findElement(By.linkText("Forgot account?")).click();
		System.out.println(driver.getTitle());
		
	}
	

}
