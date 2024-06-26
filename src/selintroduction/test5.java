package selintroduction;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class test5 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		// System.setProperty("webdriver.chrome.driver",
		// "C:\\Users\\HP\\Downloads\\chromedriver-win64\\chromedriver-win64\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://the-internet.herokuapp.com/nested_frames");
		
		driver.switchTo().frame(driver.findElement(By.cssSelector("frame[name='frame-top']")));
		driver.switchTo().frame(driver.findElement(By.cssSelector("frame[name=frame-middle]")));
		System.out.println(driver.findElement(By.cssSelector("#content")).getText());
		
		
		
		
		
		
		
		
		

		
		
		
		
		
	
	}

}
