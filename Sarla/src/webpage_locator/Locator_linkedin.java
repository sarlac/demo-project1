package webpage_locator;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Locator_linkedin {

	public static void main(String[] args) {
		
		System.setProperty("webdriver.chrome.driver","C:\\browsers\\chromedriver_win32\\chromedriver.exe");
		
		WebDriver driver=new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
		driver.get("https://www.linkedin.com/login");
		
		driver.findElement(By.id("username")).sendKeys("sachimegawe@gmail.com");
		driver.findElement(By.name("session_password")).sendKeys("qwerty");
		//driver.findElement(By.className("btn__primary--large from__button--floating")).click();
		driver.findElement(By.xpath("//button[@type='submit']")).click();
		
		//driver.close();
	}

}
