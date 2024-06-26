package selintroduction;

import org.openqa.selenium.Proxy;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebDriver.Options;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.chromium.ChromiumOptions;

public class sslcheck {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// TODO Auto-generated method stub
		ChromeOptions Options=new ChromeOptions();
		Proxy proxy=new Proxy();
		proxy.setHttpProxy("ipaddress:444");
		Options.setCapability("proxy", proxy);
		Options.setAcceptInsecureCerts(true);
		
		// System.setProperty("webdriver.chrome.driver",
		// "C:\\Users\\HP\\Downloads\\chromedriver-win64\\chromedriver-win64\\chromedriver.exe");
		WebDriver driver = new ChromeDriver(Options);
		driver.get("https://expired.badssl.com/");
		System.out.println(driver.getTitle());
		
		
		
		
		
	}

}
