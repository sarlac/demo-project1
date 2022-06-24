package webpage_locator;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Relative_xpath {

	public static void main(String[] args) {
		
		System.setProperty("webdriver.chrome.driver","C:\\browsers\\chromedriver_win32");
		
		WebDriver driver=new ChromeDriver();
		
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
		
		driver.get("https://www.facebook.com/");
		
		WebElement heading=driver.findElement(By.xpath("//h2[@class='_8eso']"));
		System.out.println(heading.getText());
		
		driver.findElement(By.xpath("//input[@id='email']")).sendKeys("sachimegawe@gmail.com");
		driver.findElement(By.xpath("//input[@id='pass']")).sendKeys("omvedi@love1");
		driver.findElement(By.xpath("//button[@name='login']")).click();
		
		
	}

}
