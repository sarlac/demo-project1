package webpage_locator;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Contains_startsWith {

	public static void main(String[] args) {
		
		System.setProperty("webdriver.chrome.driver","C:\\browsers\\chrome\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
		
		driver.get("https://www.facebook.com/");
		
		//xpath: starts with
		//format: //tagname[starts-with(@attibute,'attribute_value')
		driver.findElement(By.xpath("//input[starts-with(@id,'email')]")).sendKeys("sachimegawe@gmail.com");
		
		//xpath: starts-with
		driver.findElement(By.xpath("//input[starts-with(@id,'pass')]")).sendKeys("adsft");
		
		//xpath contains
		//format: //tagname[contains(@attribute,'value')]
		driver.findElement(By.xpath("//button[contains(@id,'u_0_d')]")).click();
		
		driver.navigate().back();
		
		//xpath by text function
		//format: //tagname[text='Actual_value']
		driver.findElement(By.xpath("//a[text()='Forgotten password?']")).click();
			
	}

}
