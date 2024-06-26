package selintroduction;

import java.util.List;
import java.util.stream.Collectors;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;

public class liveDemo {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		// System.setProperty("webdriver.chrome.driver",
		// "C:\\Users\\HP\\Downloads\\chromedriver-win64\\chromedriver-win64\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://rahulshettyacademy.com/seleniumPractise/#/offers");
	
	driver.findElement(By.cssSelector("th[role='columnheader']")).click();
	
	List<WebElement>elmentLists= driver.findElements(By.xpath("//td[1]"));
	List<String> originalList=elmentLists.stream().map(s->s.getText()).collect(Collectors.toList());
	
	
	List<String> sortedList=originalList.stream().sorted().collect(Collectors.toList());
	
	Assert.assertTrue(originalList.equals(sortedList));
	
	List<String>price;
	
	do { 	List<WebElement>rows= driver.findElements(By.xpath("//td[1]"));

	price=rows.stream().filter(s->s.getText().contains("Rice"))
.map(s->getPriceVeggie(s)).collect(Collectors.toList());
		
		price.forEach(a->System.out.println(a));
		
		if(price.size()<1) {
		
		driver.findElement(By.cssSelector("a[aria-label='Next']")).click();
		}
		}while(price.size()<1);
	
	
	
	}
	private static String getPriceVeggie(WebElement  s) {
		// TODO Auto-generated method stub
		String priceValue=s.findElement(By.xpath("following-sibling::td[1]")).getText();
		System.out.println(priceValue);
		return priceValue;
	}
}
