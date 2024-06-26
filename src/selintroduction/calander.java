package selintroduction;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class calander {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub

		// System.setProperty("webdriver.chrome.driver",
		// "C:\\Users\\HP\\Downloads\\chromedriver-win64\\chromedriver-win64\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.path2usa.com/travel-companion/");
		driver.manage().window().maximize();
	
		JavascriptExecutor js = (JavascriptExecutor)driver;

		js.executeScript("window.scrollBy(0,1200)");

		Thread.sleep(5000);

		driver.findElement(By.xpath("//input[@id='form-field-travel_comp_date']")).click();
		
		while(!driver.findElement(By.cssSelector("div[class='flatpickr-month']")).getText().contains("April")) 
		
		{
			
			
			driver.findElement(By.cssSelector("span[class='flatpickr-next-month'")).click();
		}
	

		List<WebElement> dates = driver.findElements(By.cssSelector("span[class='flatpickr-day ']"));
		int count = driver.findElements(By.cssSelector("span[class='flatpickr-day ']")).size();

		for (int i = 0; i < count; i++) {

			String text= driver.findElements(By.cssSelector("span[class='flatpickr-day ']")).get(i).getText();

			if (text.equalsIgnoreCase("9")) {

				driver.findElements(By.cssSelector("span[class='flatpickr-day ']")).get(i).click();
				break;

			}
		}
	}

}
