package selintroduction;

import java.io.IOException;

import java.net.HttpURLConnection;

import java.net.MalformedURLException;
import java.net.URISyntaxException;
import java.net.URL;

import java.net.URLConnection;
import java.time.Duration;
import java.util.List;



import org.openqa.selenium.By;

import org.openqa.selenium.WebDriver;

import org.openqa.selenium.WebElement;

import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Wait;
import org.testng.Assert;

import org.testng.asserts.SoftAssert;

public class brokenLinks {
	public static void main(String[] args) throws MalformedURLException, IOException {
	// System.setProperty("webdriver.chrome.driver",
	// "C:\\Users\\HP\\Downloads\\chromedriver-win64\\chromedriver-win64\\chromedriver.exe");
	WebDriver driver = new ChromeDriver();

    

  

 driver.get("https://www.emirates.com/eg/english/book/");
 

    

 System.out.println(driver.findElements(By.cssSelector("div[class='e-col-sm-12 e-col-lg-3 links-section'] a")).size());

 List<WebElement> links=   driver.findElements(By.cssSelector("div[class='e-col-sm-12 e-col-lg-3 links-section'] a"));

 SoftAssert a =new SoftAssert();





 for(WebElement link : links)

 {

  

     String url= link.getAttribute("href");

    

     HttpURLConnection   conn= (HttpURLConnection)new URL(url).openConnection();

     conn.setRequestMethod("HEAD");

     conn.connect();

     int respCode = conn.getResponseCode();

     System.out.println(respCode);

     a.assertTrue(respCode<504, "The link with Text"+link.getText()+" is broken with code" +respCode);

    



 }



 a.assertAll();


}}




    

    

    

    

    



  

  

  

  

  

  

  

  

  

  

  

  

  

  

  

  

    

    

    

	     
