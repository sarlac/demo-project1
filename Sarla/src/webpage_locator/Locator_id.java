package webpage_locator;

import java.util.concurrent.TimeUnit;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Locator_id {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver","C:\\browsers\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver=new ChromeDriver(); //webdrive is your interface
		driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
		driver.get("https://www.facebook.com/");	
	
		driver.findElement(By.id("email")).sendKeys("sachimegawe@gmail.com");
		driver.findElement(By.id("pass")).sendKeys("Qwerty@852");
		
		driver.findElement(By.name("login")).click();
		//driver.findElement(By.id("u_0_d_iz")).click();
		//driver.findElement(By.className(_42ft _4jy0 _6lth _4jy6 _4jy1 selected _51sy)).click();
		
		
		//driver.close();

	}

}
