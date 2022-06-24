package assignment1;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class TextBox {

	public static void main(String[] args) {
		
		System.setProperty("webdriver.chrome.driver","C:\\browsers\\chrome\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		
		driver.manage().window().maximize();
		
						
		driver.get("https://demoqa.com/text-box");
		
		driver.findElement(By.xpath("//input[@id='userName']//ancestor::div[2]//following::input[1]")).sendKeys("sarla");
		driver.findElement(By.xpath("//input[@id='userName']//ancestor::div[2]//following::input[2]")).sendKeys("sachimegawe@gmail.com");
	
	}

}
