import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.Assert;


public class testcaseSpicejetwithChrome {
	
	public static void main(String[] args) throws InterruptedException {

		System.setProperty("webdriver.chrome.driver", "//Users//Oz//Documents//Selenium//drivers//chromedriver");
		WebDriver driver = new ChromeDriver();

		driver.get("https://spicejet.com");
		
		//click on roundtrip option		
		//driver.findElement(By.id("ctl00_mainContent_rbtnl_Trip_1")).click();	
		
		
		//check if checkbox is unselected
		Assert.assertFalse(driver.findElement(By.cssSelector("input[id *= 'friendsandfamily']")).isSelected());
		
		//check the checkbox of friends and family
		driver.findElement(By.cssSelector("input[id *= 'friendsandfamily']")).click();	
		
		//check if selection was successful 
		Assert.assertTrue(driver.findElement(By.cssSelector("input[id *= 'friendsandfamily']")).isSelected());
		
		//count number of checbox on page
		int num_of_checkboxes = driver.findElements(By.cssSelector("input[type = 'checkbox']")).size();
		
		//check if it is equal with 6
		Assert.assertEquals(num_of_checkboxes, 6);
		
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
		//Selecting Arrival City
		driver.findElement(By.xpath("//a[@value = 'MAA']")).click();
		//Selecting Date as Today
		driver.findElement(By.cssSelector("a[class *= 'ui-state-active']")).click();
		
		if (driver.findElement(By.id("Div1")).getAttribute("style").contains("opacity: " + "1")) {
			System.out.println("It is enabled");
			
		} else {
			driver.quit();

		}	
		
		Thread.sleep(2000L);//Sleep time to enable clinking on submit button
		//Submit the search
		driver.findElement(By.cssSelector("[name = 'ctl00$mainContent$btn_FindFlights']")).click();
		Thread.sleep(5000L);//Sleep time to enable clinking on submit button

		driver.quit();
		
		
		
		
		

	}
	
	

}
