package webpage_locator;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Locator_google {

	public static void main(String[] args) {
	
		System.setProperty("webdriver.chrome.driver","C:\\browsers\\chrome\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver=new ChromeDriver(); //webdrive is your interface
		driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
		driver.get("https://www.google.com");
		
		//driver.findElement(By.name("q")).sendKeys("selenium.dev");
		driver.findElement(By.className("gLFyf")).sendKeys("selenium.dev");
		driver.findElement(By.name("btnK")).click();
		
		driver.close();

	}

}
