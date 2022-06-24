package webpage_locator;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Cssselector {

	public static void main(String[] args) {
		System.setProperty("webdriver.gecko.driver","C:\\browsers\\firefox\\geckodriver-v0.31.0-win64\\geckodriver.exe");
		WebDriver driver=new FirefoxDriver();
		
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
		
		driver.get("https://www.google.com/");
		
		driver.findElement(By.cssSelector("input.gLFyf")).sendKeys("webpage locator using css selector");
		driver.findElement(By.cssSelector("input[class='gNO89b']")).click();
		//driver.close();
	}

}
