package selintroduction;

import java.time.Duration;
import java.util.Iterator;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class windwhandles {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		// System.setProperty("webdriver.chrome.driver",
		// "C:\\Users\\HP\\Downloads\\chromedriver-win64\\chromedriver-win64\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://rahulshettyacademy.com/loginpagePractise/");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
		driver.manage().window().maximize();

		driver.findElement(By.cssSelector(".blinkingText")).click();
		Set<String> windows = driver.getWindowHandles();

		Iterator<String> it = windows.iterator();

		String parentId = it.next();

		String childId = it.next();

		driver.switchTo().window(childId);

		System.out.println(driver.findElement(By.cssSelector("p[class='im-para red']")).getText());
		driver.findElement(By.cssSelector("p[class='im-para red']")).getText();
		String emailID = driver.findElement(By.cssSelector("p[class='im-para red']")).getText().split("at")[1].trim()
				.split(" ")[0];
		
		System.out.println(emailID);
		driver.switchTo().window(parentId);
		driver.findElement(By.id("username")).sendKeys(emailID);
	

	}

}