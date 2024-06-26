package selintroduction;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;

public class dropdown2 {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		///System.setProperty("webdriver.chrome.driver", "C:\\Users\\HP\\Downloads\\chromedriver-win64\\chromedriver-win64\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://rahulshettyacademy.com/dropdownsPractise/");
				

		System.out.println(driver.findElement(By.id("Div1")).getAttribute("style"));
	
		driver.findElement(By.id("ctl00_mainContent_rbtnl_Trip_1")).click();
		
		if(driver.findElement(By.id("Div1")).getAttribute("style").contains("1"))
		{
		System.out.println("its enabled");
		Assert.assertTrue(true);
		}
		

		 
		 driver.findElement(By.id("ctl00_mainContent_ddl_originStation1_CTXT")).click();
		
		Thread.sleep(2000);
	driver.findElement(By.linkText("Bengaluru (BLR)")).click();
		Thread.sleep(2000);
		
		driver.findElement(By.xpath("//div[@id='glsctl00_mainContent_ddl_destinationStation1_CTNR'] //a[@value='MAA']")).click();
		driver.findElement(By.cssSelector("a[class='ui-state-default ui-state-highlight ui-state-hover']")).click();
		
		
		
	}

}
