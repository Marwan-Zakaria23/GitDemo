package selintroduction;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class test {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		///System.setProperty("webdriver.chrome.driver", "C:\\Users\\HP\\Downloads\\chromedriver-win64\\chromedriver-win64\\chromedriver.exe");
				WebDriver driver = new ChromeDriver();
				driver.get("https://rahulshettyacademy.com/angularpractice/");
				driver.manage().window().maximize();
				driver.findElement(By.name("name")).sendKeys("Marwan zakaria");
				driver.findElement(By.name("email")).sendKeys("marwansameh@gmail.com");
                 driver.findElement(By.id("exampleInputPassword1")).sendKeys("Marwan@23");
                 driver.findElement(By.id("exampleCheck1")).click();
                 
                 WebElement StaticDropdown = driver.findElement(By.id("exampleFormControlSelect1"));
 				Select Dropdown= new Select(StaticDropdown);
 				Dropdown.selectByVisibleText("Male");
				System.out.println(Dropdown.getFirstSelectedOption().getText());
				
				Thread.sleep(1000);
				driver.findElement(By.id("inlineRadio1")).click();
				driver.findElement(By.name("bday")).sendKeys("9231996");
				driver.findElement(By.cssSelector("input[type='submit']")).click();
				Thread.sleep(2000);
				System.out.println(driver.findElement(By.cssSelector("div[class='alert alert-success alert-dismissible']")).getText());
                 
               
               
	}

}
