import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.remote.DesiredCapabilities;

public class testCaseRediffInChrome {
	
	public static void main(String[] args) {


		System.setProperty("webdriver.chrome.driver", "//Users//Oz//Documents//Selenium//drivers//chromedriver");
		WebDriver driver = new ChromeDriver();

		driver.get("https://rediff.com");
		driver.findElement(By.cssSelector("a[title *= 'Sign in']")).click();
		driver.findElement(By.xpath("//input[@id = 'login1/paretn::div/input']")).sendKeys("myname");
		driver.findElement(By.cssSelector("input#password")).sendKeys("1234");
		driver.findElement(By.xpath("//input[contains( @name, 'procee')]")).click();
		

	}

}
