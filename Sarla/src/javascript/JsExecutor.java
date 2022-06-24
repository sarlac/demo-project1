package javascript;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class JsExecutor {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver","C:\\browsers\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
		
		driver.get("https://www.facebook.com/");
		
		JavascriptExecutor js=(JavascriptExecutor)driver;
		
		//alert pop window
		js.executeScript("alert('Happy Birthday');"); Thread.sleep(3000);
	    driver.switchTo().alert().accept();
		 
		
		//Click on hidden element
		//driver.navigate().back();
		WebElement ForgotPassword=driver.findElement(By.xpath("//a[text()='Forgotten password?']"));
		js.executeScript("arguments[0].click();",ForgotPassword);
		
		//perform a scroll on application
		driver.get("https://www.amazon.in/");
		js.executeScript("window.scrollBy(0,600)");
		
		//to refresh browser window 
		js.executeScript("history.go(0)");
		
		 //Get page title and Domain using JavascriptExecutor
		String titleText =  js.executeScript("return document.title;").toString();
        System.out.println("Page Title is: "+ titleText);
        
        String domainName=  js.executeScript("return document.domain;").toString();
        System.out.println("Domain is: "+domainName);
        
        //get the URL of the site. Tostring() change object to name		
        String url = js.executeScript("return document.URL;").toString();			
        System.out.println("URL of the site = "+url);
        
      //Navigate to new Page i.e to generate access page. (launch new url)		
        js.executeScript("window.location = 'http://demo.guru99.com/'");
		 
		
		
		
	}

}
