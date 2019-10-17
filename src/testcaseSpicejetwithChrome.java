import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class testcaseSpicejetwithChrome {
	
	public static void main(String[] args) throws InterruptedException {

		System.setProperty("webdriver.chrome.driver", "//Users//Oz//Documents//Selenium//drivers//chromedriver");
		WebDriver driver = new ChromeDriver();

		driver.get("https://spicejet.com");
		
		//Instantiating object for drop down for currency
		Select currency_select = new Select(driver.findElement(By.cssSelector("#ctl00_mainContent_DropDownListCurrency")));		
		currency_select.selectByValue("USD");
		
		
		//Instantiating object for drop down for Adult passanger dropdown
		driver.findElement(By.cssSelector("#divpaxinfo")).click(); //selecting main drop down div

		Select adult_passanger_select = new Select(driver.findElement(By.cssSelector("[name = 'ctl00$mainContent$ddl_Adult']")));		
		adult_passanger_select.selectByValue("5");
		
		driver.findElement(By.cssSelector("#divpaxinfo")).click();
		
		System.out.println(driver.findElement(By.cssSelector("#divpaxinfo")).getText());
		
		
		//Selecting Departure City		
		driver.findElement(By.cssSelector("input#ctl00_mainContent_ddl_originStation1_CTXT")).click();
		driver.findElement(By.cssSelector("a[value = 'BLR']")).click();		
		driver.findElement(By.xpath("//a[@value = 'MAA']")).click();
		driver.findElement(By.xpath("//div[@class='ui-datepicker-group ui-datepicker-group-first']//a[@class='ui-state-default'][contains(text(),'21')]")).click();
		Thread.sleep(2000L);
		driver.findElement(By.cssSelector("[name = 'ctl00$mainContent$btn_FindFlights']")).click();
		

		

	
		
		//driver.quit();
		
		
		
		
		

	}
	
	

}
