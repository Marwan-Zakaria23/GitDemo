package selintroduction;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class test7 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// System.setProperty("webdriver.chrome.driver",
		// "C:\\Users\\HP\\Downloads\\chromedriver-win64\\chromedriver-win64\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://rahulshettyacademy.com/AutomationPractice/");

		JavascriptExecutor js = (JavascriptExecutor) driver;

		js.executeScript("window.scrollBy(0,650)");

		System.out.println(driver.findElements(By.cssSelector(".table-display tr")).size());

		System.out.println(driver.findElements(By.cssSelector(".table-display th")).size());

		List<WebElement> text = driver.findElements(By.tagName("tr")).get(2).findElements(By.tagName("td"));

		System.out.println(text.get(0).getText());

		System.out.println(text.get(1).getText());

		System.out.println(text.get(2).getText());

	}

}
