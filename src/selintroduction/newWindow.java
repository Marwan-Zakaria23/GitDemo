package selintroduction;

import java.io.File;
import java.io.IOException;
import java.util.Iterator;
import java.util.Set;
import java.util.logging.Handler;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.WindowType;
import org.openqa.selenium.chrome.ChromeDriver;

public class newWindow {

	public static void main(String[] args)throws InterruptedException, IOException {
		// TODO Auto-generated method stub
		// System.setProperty("webdriver.chrome.driver",
		// "C:\\Users\\HP\\Downloads\\chromedriver-win64\\chromedriver-win64\\chromedriver.exe");

	WebDriver driver = new ChromeDriver();
	driver.get("https://rahulshettyacademy.com/angularpractice/");
	//switching window
	driver.switchTo().newWindow(WindowType.WINDOW);
             Set<String>handles=driver.getWindowHandles();
             Iterator<String> it= handles.iterator();
         	
             String parentId = it.next();
    		String childId = it.next();
    		
    		driver.switchTo().window(childId);
    		driver.get("https://www.rahulshettyacademy.com/");
    	String coursesName=	driver.findElements(By.cssSelector("a[href*='https://courses.rahulshettyacademy.com/p/']"))
    		.get(1).getText();
    	
    	System.out.println(coursesName);
    	driver.switchTo().window(parentId);
    	WebElement name=driver.findElement(By.cssSelector("[name='name']"));
    	name.sendKeys(coursesName);
    	//ScreenShot
    	File file=name.getScreenshotAs(OutputType.FILE);
 FileUtils.copyFile(file, new File("logo.png"));
 
 
 //get height and width
 System.out.println(name.getRect().getDimension().getHeight());
 System.out.println(name.getRect().getDimension().getWidth());
	}


}
