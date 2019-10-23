import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.remote.DesiredCapabilities;

public class facebookXpath {

	public static void main(String[] args) {


		System.setProperty("webdriver.chrome.driver", "//Users//Oz//Documents//Selenium//drivers//chromedriver");
		
		ChromeOptions chrome_options = new ChromeOptions();
		chrome_options.addArguments("--incognito");
		DesiredCapabilities capabilities = DesiredCapabilities.chrome();
		capabilities.setCapability(ChromeOptions.CAPABILITY, chrome_options);
		

		WebDriver driver = new ChromeDriver();

		driver.get("https://facebook.com"); //hit url on the browser	
		driver.findElement(By.xpath("//*[@type = 'email']")).sendKeys("user@gmail.com");
		driver.findElement(By.xpath("//input[@type = 'password']")).sendKeys("123456");
		//driver.findElement(By.xpath("//input[@value = 'Log In']")).click();
		
		driver.findElement(By.cssSelector("input[type = 'email']")).sendKeys("faszom");
		driver.findElement(By.cssSelector("[name = 'password']")).sendKeys("1234");


	}

}