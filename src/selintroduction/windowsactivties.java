package selintroduction;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class windowsactivties {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		///System.setProperty("webdriver.chrome.driver", "C:\\Users\\HP\\Downloads\\chromedriver-win64\\chromedriver-win64\\chromedriver.exe");
				WebDriver driver = new ChromeDriver();
				driver.manage().window().maximize();
				driver.get("https://www.google.com/");
		        driver.navigate().to("https://rahulshettyacademy.com/");
		        driver.navigate().back();
		        driver.navigate().forward();
		      
		
		
	}

}
