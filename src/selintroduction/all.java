package selintroduction;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.Assert;




public class all {

	public static  void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		///System.setProperty("webdriver.chrome.driver", "C:\\Users\\HP\\Downloads\\chromedriver-win64\\chromedriver-win64\\chromedriver.exe");
				WebDriver driver = new ChromeDriver();
				driver.get("https://rahulshettyacademy.com/dropdownsPractise/");
				WebElement StaticDropdown = driver.findElement(By.id("ctl00_mainContent_DropDownListCurrency"));
				Select Dropdown= new Select(StaticDropdown);
				Dropdown.selectByIndex(3);
				System.out.println(Dropdown.getFirstSelectedOption().getText());
				 
			
				Thread.sleep(2000);
			driver.findElement(By.id("divpaxinfo")).click();
	Thread.sleep(1000);
		for(int i=1;i<4;i++)	{
		
             driver.findElement(By.cssSelector("span[id='hrefIncAdt']")).click();
             }
	
           driver.findElement(By.id("btnclosepaxoption")).click();
           
		//System.out.println(driver.findElement(By.id("divpaxinfo")).getText());
		
           Assert.assertEquals((driver.findElement(By.id("divpaxinfo")).getText()) ,"4 Adult");
		
		Thread.sleep(2000);
		
		driver.findElement(By.id("ctl00_mainContent_ddl_originStation1_CTXT")).click();
		Thread.sleep(2000);
	driver.findElement(By.linkText("Bengaluru (BLR)")).click();
		Thread.sleep(2000);
		
		driver.findElement(By.xpath("//div[@id='glsctl00_mainContent_ddl_destinationStation1_CTNR'] //a[@value='MAA']")).click();
		
		driver.findElement(By.cssSelector("a[class='ui-state-default ui-state-highlight ui-state-hover']")).click();
		if(driver.findElement(By.id("Div1")).getAttribute("style").contains("0.5"))

		{

		System.out.println("its disabled");

		Assert.assertTrue(true);

		}

		else

		{

		Assert.assertTrue(false);

		}
		
		
		
		
		Thread.sleep(2000);
		driver.findElement(By.id("autosuggest")).sendKeys("fr");
		Thread.sleep(3000);
		List<WebElement> options =driver.findElements(By.cssSelector("li[class='ui-menu-item'] a"));
		
		for (WebElement option : options ) {
			if(option.getText().equalsIgnoreCase("France")) {
			
				option.click();
				
				break;
		}
	}
		 
	
		Assert.assertFalse(driver.findElement(By.id("ctl00_mainContent_chk_friendsandfamily")).isSelected());
		
		//System.out.println(driver.findElement(By.id("ctl00_mainContent_chk_friendsandfamily")).isSelected());	
		
		driver.findElement(By.id("ctl00_mainContent_chk_friendsandfamily")).click();
	    System.out.println(driver.findElement(By.id("ctl00_mainContent_chk_friendsandfamily")).isSelected());
		driver.findElement(By.id("ctl00_mainContent_chk_SeniorCitizenDiscount")).click();
		System.out.println(driver.findElement(By.id("ctl00_mainContent_chk_SeniorCitizenDiscount")).isSelected());
		 
		System.out.println(driver.findElements(By.cssSelector("input[type='checkBox']")).size());
		driver.findElement(By.id("ctl00_mainContent_btn_FindFlights")).click();
		
		
		
	
	
}	 		
}