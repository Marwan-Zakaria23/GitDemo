package selintroduction;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

public class test3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		///System.setProperty("webdriver.chrome.driver", "C:\\Users\\HP\\Downloads\\chromedriver-win64\\chromedriver-win64\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://rahulshettyacademy.com/loginpagePractise/");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));

		driver.findElement(By.id("username")).sendKeys("rahulshettyacademy");
		driver.findElement(By.id("password")).sendKeys("learning");
		driver.findElement(By.cssSelector("label.customradio:nth-child(2) span.checkmark:nth-child(3")).click();

		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(5));

		wait.until(ExpectedConditions.visibilityOfElementLocated(By.id("okayBtn")));

		driver.findElement(By.id("okayBtn")).click();

		WebElement StaticDropdown = driver.findElement(By.cssSelector("Select.form-control"));
		Select Dropdown = new Select(StaticDropdown);
		Dropdown.selectByVisibleText("Student");
		System.out.println(Dropdown.getFirstSelectedOption().getText());
		driver.findElement(By.cssSelector("input[id='terms']")).click();
		driver.findElement(By.id("signInBtn")).click();
		WebDriverWait w = new WebDriverWait(driver, Duration.ofSeconds(5));
		w.until(ExpectedConditions.visibilityOfElementLocated(By.cssSelector("button.btn")));
		
		List<WebElement> products = driver.findElements(By.cssSelector(".card-footer .btn-info"));

		for (int i = 0; i < products.size(); i++)

		{

			products.get(i).click();

		}

		driver.findElement(By.cssSelector("a[class='nav-link btn btn-primary']")).click();

	}

}