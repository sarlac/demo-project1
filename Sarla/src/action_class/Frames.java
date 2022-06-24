package action_class;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Frames {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver","C:\\browsers\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
		
		driver.get("https://demoqa.com/frames");
		
		//using name/id
		//driver.switchTo().frame("frame1");
		
		//by indexing method
		//driver.switchTo().frame(1);
		
		//locate frame using webelement
		
		WebElement iframe=driver.findElement(By.xpath("//iframe[@id='frame1']"));
		driver.switchTo().frame(iframe);
		
		WebElement message=driver.findElement(By.xpath("//h1[text()='This is a sample page'][1]"));
		System.out.println(message);
		
	}

}
