package selintroduction;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class test6 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// System.setProperty("webdriver.chrome.driver",
		// "C:\\Users\\HP\\Downloads\\chromedriver-win64\\chromedriver-win64\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://rahulshettyacademy.com/AutomationPractice/");

		driver.findElement(By.id("checkBoxOption2")).click();
		String op = driver.findElement(By.cssSelector("label[for='benz']")).getText();

		Select dropdown = new Select(driver.findElement(By.id("dropdown-class-example")));
		dropdown.selectByVisibleText(op);

		driver.findElement(By.id("name")).sendKeys(op);

		driver.findElement(By.id("alertbtn")).click();
		String optext = driver.switchTo().alert().getText();
		if (optext.contains(op)) {

			System.out.println(optext);
		} else {
			System.out.println("fail");
		}

		driver.switchTo().alert().accept();
		
	}

}
