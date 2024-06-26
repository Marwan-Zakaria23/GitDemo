package selintroduction;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class updateddropdown {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		///System.setProperty("webdriver.chrome.driver", "C:\\Users\\HP\\Downloads\\chromedriver-win64\\chromedriver-win64\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.spicejet.com/");
		 driver.manage().window().maximize();	
		
		 Thread.sleep(2000);
		 
		 
		 driver.findElement(By.xpath("//div[@data-testid='home-page-travellers']")).click();		
	      	
	       for (int i=1;i<5;i++)		
	       {		   
	            driver.findElement(By.xpath("//div[@data-testid='Adult-testID-plus-one-cta']")).click();		
	       }		
	       driver.findElement(By.xpath("//div[@data-testid='home-page-travellers-done-cta']")).click();        
	       System.out.println(driver.findElement(By.xpath("//div[@data-testid='home-page-travellers']")).getText());
	        
	        
	}        
}	
	


