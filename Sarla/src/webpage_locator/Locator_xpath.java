package webpage_locator;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Locator_xpath {

	public static void main(String[] args) {
		
		System.setProperty("webdriver.chrome.driver","C:\\browsers\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(20,TimeUnit.SECONDS);
		driver.get("https://www.facebook.com/");
		
		//basic format of xpath //tagname[@attribute='value']
		driver.findElement(By.xpath("//input[@name='email']")).sendKeys("sarla");
		
		//absolute x path 
		//format: /root node/child node/child node/child node/...../input_tag(element we are trying to locate)
		driver.findElement(By.xpath("/html/body/div[1]/div[2]/div[1]/div/div/div/div[2]/div/div[1]/form/div[1]/div[2]/div/input")).sendKeys("Chimegawe");		
		
		//relative xpath format: //tagname[@attribute='value']
		driver.findElement(By.xpath("//button[@name='login']")).click();
		
		driver.close();
		
	}

}
