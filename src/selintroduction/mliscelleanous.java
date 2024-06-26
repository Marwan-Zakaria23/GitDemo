package selintroduction;

import java.io.File;
 
import java.io.IOException;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.apache.commons.io.FileUtils;

public class mliscelleanous {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		// System.setProperty("webdriver.chrome.driver",
				// "C:\\Users\\HP\\Downloads\\chromedriver-win64\\chromedriver-win64\\chromedriver.exe");
				WebDriver driver = new ChromeDriver();
				driver.get("https://www.google.com/");
                driver.manage().deleteAllCookies();
                File src= ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
                FileUtils.copyFile(src,new File("C:\\Users\\HP\\screenshot.png"));	
                
         

                

	}

}
