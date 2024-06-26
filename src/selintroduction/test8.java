package selintroduction;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class test8 {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
				// System.setProperty("webdriver.chrome.driver",
				// "C:\\Users\\HP\\Downloads\\chromedriver-win64\\chromedriver-win64\\chromedriver.exe");
				WebDriver driver = new ChromeDriver();
				driver.get("https://rahulshettyacademy.com/AutomationPractice/");

	    driver.findElement(By.id("autocomplete")).sendKeys("ind");

	    Thread.sleep(2000);

	    driver.findElement(By.id("autocomplete")).sendKeys(Keys.DOWN);

	    driver.findElement(By.id("autocomplete")).sendKeys(Keys.DOWN);
	    driver.findElement(By.id("autocomplete")).sendKeys(Keys.ENTER);
	   System.out.println(driver.findElement(By.id("autocomplete")).getAttribute("value")); 
	}

}
