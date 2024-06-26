package selintroduction;

import java.util.Iterator;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class scope {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// System.setProperty("webdriver.chrome.driver",
		// "C:\\Users\\HP\\Downloads\\chromedriver-win64\\chromedriver-win64\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://rahulshettyacademy.com/AutomationPractice/");
		
		System.out.println(driver.findElements(By.tagName("a")).size());
		
		WebElement footerdriver=driver.findElement(By.id("gf-BIG"));
		System.out.println(footerdriver.findElements(By.tagName("a")).size());
		
	
		WebElement coulmdriver=driver.findElement(By.xpath("//table/tbody/tr/td[1]/ul"));
		System.out.println(coulmdriver.findElements(By.tagName("a")).size());
	for(int i=1;i<coulmdriver.findElements(By.tagName("a")).size();i++)
	{
		
		String clickonLinkTab=Keys.chord(Keys.CONTROL,Keys.ENTER);
				coulmdriver.findElements(By.tagName("a")).get(i).sendKeys(clickonLinkTab);
				

	}
	
	Set<String> abc=driver.getWindowHandles();
	Iterator<String> it=abc.iterator();
	while(it.hasNext()) {
	
	driver.switchTo().window(it.next());
	System.out.println(driver.getTitle());
	}
	}
}