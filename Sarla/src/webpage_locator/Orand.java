package webpage_locator;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Orand {

		public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver","C:\\browsers\\chrome\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
		
		driver.get("https://www.facebook.com/");
		
		//xpath using and method
		//format://tagname[@attributetype='attribute_value' and @attribute_type='attribute_value'
		driver.findElement(By.xpath("//input[@name='email' and @data-testid='royal_email']")).sendKeys("sachimegawe@gmail.com");
		
		//xpath using and method
		//format://tagname[@attributetype='attribute_value' or @attribute_type='attribute_value'
		driver.findElement(By.xpath("//input[@type='password' or @name='royal_email']")).sendKeys("omvedi@love1");
	
		driver.close();
	}

}
