package webpage_locator;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Absolute_xpath {

	public static void main(String[] args) {
		
		System.setProperty("webdriver.chrome.driver","C:\\browsers\\chrome\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
		
		driver.get("https://www.selenium.dev/");
		
		driver.findElement(By.xpath("/html/body/header/nav/div/ul/li[3]/a/span")).click();
		driver.findElement(By.xpath("/html/body/div/main/div[11]/div/div/p[2]/button")).click();
		driver.findElement(By.xpath("/html/body/div/main/div[11]/div/div/div[1]/div[3]/div/div[2]/div/p/a")).click();
		
		driver.close();
	}

}
