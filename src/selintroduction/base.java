package selintroduction;

import java.time.Duration;
import java.util.Arrays;
import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;

public class base {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		/// System.setProperty("webdriver.chrome.driver",
		// "C:\\Users\\HP\\Downloads\\chromedriver-win64\\chromedriver-win64\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		String[] Items = { "Cucumber", "Brocolli", "Beetroot", "Carrot" };
		
		driver.get("https://rahulshettyacademy.com/seleniumPractise/#/");
		//driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
		
		Thread.sleep(3000);
		addItems(driver,Items);
	
	driver.findElement(By.cssSelector("img[alt='Cart']")).click();
	driver.findElement(By.xpath("//button[contains(text(),'PROCEED TO CHECKOUT')]")).click();
	
	Thread.sleep(3000);
	driver.findElement(By.cssSelector("input.promoCode")).sendKeys("rahulshettyacademy");
	driver.findElement(By.cssSelector("button.promoBtn")).click();

	
	WebDriverWait w =new WebDriverWait(driver, Duration.ofSeconds(5));
	w.until(ExpectedConditions.visibilityOfElementLocated(By.cssSelector("span.promoInfo")));
	
System.out.println(driver.findElement(By.cssSelector("span.promoInfo")).getText());
	   
	

	
	}

	
	
	
	public static void addItems(WebDriver driver,String[] Items) {
		
		int j = 0;
	List<WebElement> products = driver.findElements(By.cssSelector("h4.product-name"));

	for (int i = 0; i < products.size(); i++) {

		String[] name = products.get(i).getText().split("-");

		String formattedName = name[0].trim();
		List Itemslist = Arrays.asList(Items);

		if (Itemslist.contains(formattedName))

		{
			j++;

			driver.findElements(By.xpath("//div[@class='product-action']/button")).get(i).click();

			if (j == Items.length) {
				break;
			}

		}

	}
}
}

	