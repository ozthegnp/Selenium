import java.util.concurrent.TimeUnit;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.safari.SafariDriver;

public class facebookTestCase {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "//Users//Oz//Documents//Selenium//drivers//chromedriver");

		WebDriver driver = new ChromeDriver();
		
		driver.get("https://facebook.com"); //hit url on the browser		
		/*driver.findElement(By.id("email")).sendKeys("This is my first code");
		driver.findElement(By.name("pass")).sendKeys("123456");
		driver.findElement(By.linkText("Forgot account?")).click();
		System.out.println(driver.getTitle());*/
		driver.findElement(By.cssSelector("#email")).sendKeys("This is my first code");
		driver.findElement(By.xpath("//*[@id='pass']")).sendKeys("123456");
		driver.findElement(By.xpath("//*[@id=\'login_form\']/table/tbody/tr[3]/td[2]/div/a")).click();
		//driver.quit();
		
		//*[@id='forgot_password_link']
	}
	

}
