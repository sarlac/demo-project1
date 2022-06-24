package webpage_locator;



import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Ancestors {

	public static void main(String[] args) {
	
		System.setProperty("webdriver.chrome.driver","C:\\browsers\\chrome\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
		
		driver.get("https://demoqa.com/tool-tips\r\n");;
	
		WebElement contrary=driver.findElement(By.linkText("Contrary"));
		Actions s=new Actions(driver);
		s.moveToElement(contrary).build().perform();
		System.out.println(contrary.getText());
		
		
		driver.get("https://demoqa.com/text-box");
		driver.findElement(By.xpath("//input[@id='userName']//ancestor::div[2]//following::input[1]")).sendKeys("sarla");
		driver.findElement(By.xpath("//input[@id='userName']//ancestor::div[2]//following::input[2]")).sendKeys("sachimegawe@gmail.com");
		
	}
	
}
