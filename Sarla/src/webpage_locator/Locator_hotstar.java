package webpage_locator;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Locator_hotstar {

	public static void main(String[] args) {
		
		System.setProperty("webdriver.chrome.driver","C:\\browsers\\chromedriver_win32\\chromedriver.exe");
		
		WebDriver driver=new ChromeDriver();
		
		driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
		driver.get("https://www.hotstar.com/in");

		//driver.findElement(By.id("phoneNo")).sendKeys("7056912404");
		//driver.findElement(By.name("phoneNo")).sendKeys("7028917404");
		driver.findElement(By.className("form-control")).sendKeys("7028917404");
		
		driver.findElement(By.className("submit-button")).click();
		
		driver.close();
		
	}

}
