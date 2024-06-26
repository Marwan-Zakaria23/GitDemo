package selintroduction;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class checkbox {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		///System.setProperty("webdriver.chrome.driver", "C:\\Users\\HP\\Downloads\\chromedriver-win64\\chromedriver-win64\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.cheapoair.com/");
		Thread.sleep(1000);
		System.out.println(driver.findElement(By.className("returnFromOtherairport")).isSelected());
        driver.findElement(By.className("returnFromOtherairport")).click();
        System.out.println(driver.findElement(By.className("returnFromOtherairport")).isSelected());
		//driver.findElement(By.cssSelector("svg[class='sv svg-1 close-icon-color  ']")).click();
		driver.findElement(By.cssSelector("label[for='onewayTrip']")).click();
          driver.findElement(By.cssSelector("label[for='multiTrip']")).click();
		//Thread.sleep(1000);
		
            System.out.println(driver.findElements(By.cssSelector("label[class='custom-control-label']")).size());
		
		
		
		
		
		
		
		

		
		
		
		
		
		
		
		
	}

}
