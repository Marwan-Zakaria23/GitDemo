package selintroduction;


import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.Test;


public class staticdown extends sslcheck {

	public static  void main(String[] args) {
		// TODO Auto-generated method stub
		///System.setProperty("webdriver.chrome.driver", "C:\\Users\\HP\\Downloads\\chromedriver-win64\\chromedriver-win64\\chromedriver.exe");
				WebDriver driver = new ChromeDriver();
				driver.get("https://rahulshettyacademy.com/dropdownsPractise/");
				WebElement StaticDropdown = driver.findElement(By.id("ctl00_mainContent_DropDownListCurrency"));
				Select Dropdown= new Select(StaticDropdown);
				Dropdown.selectByIndex(3);
				System.out.println(Dropdown.getFirstSelectedOption().getText());
				Dropdown.selectByVisibleText("AED");
				System.out.println(Dropdown.getFirstSelectedOption().getText());
				Dropdown.selectByValue("INR");
				System.out.println(Dropdown.getFirstSelectedOption().getText());
			
					
					 
				
				
				
	
		
					
	}
	@Test


	public void sslcheck() {
		
		sslcheck();
		
		 
	
	
	}


}
