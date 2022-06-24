package webpage_locator;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Locator_guru99 {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver","C:\\browsers\\chrome\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver=new ChromeDriver(); 							//webdrive is your interface
		driver.manage().timeouts().implicitlyWait(5,TimeUnit.SECONDS);
		driver.get("https://demo.guru99.com/test/newtours/register.php");	
		
		driver.findElement(By.xpath("//input[@name='firstName']")).sendKeys("sarla");
		driver.findElement(By.xpath("//input[@name='lastName']")).sendKeys("xyx");
		driver.findElement(By.xpath("//input[@name='phone']")).sendKeys("7028917404");
		driver.findElement(By.xpath("//input[@id='userName']")).sendKeys("sachimegawe@gmail.com");
		driver.findElement(By.xpath("//input[@name='address1']")).sendKeys("wagholi");
		driver.findElement(By.xpath("//input[@name='city']")).sendKeys("Pune");
		driver.findElement(By.xpath("//input[@name='state']")).sendKeys("Maharashtra");
		driver.findElement(By.xpath("//input[@name='postalCode']")).sendKeys("413544");
		driver.findElement(By.xpath("//input[@name='email']")).sendKeys("sarlac");
		driver.findElement(By.xpath("//input[@name='password']")).sendKeys("sar44");
		driver.findElement(By.xpath("//input[@name='confirmPassword']")).sendKeys("sar44");
		driver.findElement(By.xpath("//input[@name='submit']")).click();
		
		driver.close();;
	}

}
